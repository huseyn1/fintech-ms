package az.unibank.ms.fintech.controller;

import az.unibank.ms.fintech.dto.UserdDto;
import az.unibank.ms.fintech.entity.User;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("v1/auth")
public class AuthController {

    @GetMapping("/first-controller")
    public ResponseEntity<User> getFirstController(){
        return new ResponseEntity<>(User.builder().firstName("Huseyn").build(), HttpStatus.OK);
    }

    @PostMapping("/regsiter")
    public ResponseEntity<UserdDto> registration(@RequestBody UserDto userDto ) {


    }

}
