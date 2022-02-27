package az.unibank.ms.fintech.controller;

import az.unibank.ms.fintech.dto.UserdDto;
import az.unibank.ms.fintech.service.AuthenticationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("v1/auth")
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/registration")
    public ResponseEntity<String> registration(@RequestBody UserdDto userDto) {

        return new ResponseEntity<>(authenticationService.registration(userDto),
                HttpStatus.OK);
    }

}
