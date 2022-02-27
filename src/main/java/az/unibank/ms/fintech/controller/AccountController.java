package az.unibank.ms.fintech.controller;

import az.unibank.ms.fintech.dto.AccountDto;
import az.unibank.ms.fintech.service.AccountService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1")
@Api(value = "Accounts api")
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/accounts")
    public ResponseEntity<List<AccountDto>> getActiveAccounts(
            @RequestParam("pin") String pin) {
        return new ResponseEntity<>(accountService.getAccounts(pin), HttpStatus.OK);
    }


}
