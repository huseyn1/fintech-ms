package az.unibank.ms.fintech.handler;


import az.unibank.ms.fintech.dto.ErrorResponseDto;
import az.unibank.ms.fintech.exception.BadRequestException;
import az.unibank.ms.fintech.exception.RecordNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<ErrorResponseDto> handleBadRequestException(BadRequestException ex,
                                                                            WebRequest webRequest) {
        return new ResponseEntity<>(getErrorResponseDto(ex,HttpStatus.BAD_REQUEST,webRequest,ex.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RecordNotFoundException.class)
    public final ResponseEntity<ErrorResponseDto> handleRecordNotFoundException(RecordNotFoundException ex,
                                                                            WebRequest webRequest) {
        return new ResponseEntity<>(getErrorResponseDto(ex,HttpStatus.NOT_FOUND,webRequest,ex.getMessage()),
                HttpStatus.NOT_FOUND);
    }

    private ErrorResponseDto getErrorResponseDto(Exception ex,
                                                 HttpStatus httpStatus,
                                                 WebRequest webRequest,
                                                 String message) {
        return new ErrorResponseDto(
               httpStatus.value(),
               httpStatus.getReasonPhrase(),
               message
        );
    }

}
