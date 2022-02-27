package az.unibank.ms.fintech.mock;

import az.unibank.ms.fintech.dto.AccountDto;
import az.unibank.ms.fintech.entity.Account;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MockData {

    public static List<AccountDto> getAccountDtos() {
        var account1 = AccountDto.builder()
                .accountNumber("14895957258124578399")
                .firstName("test")
                .lastName("test")
                .pin("AAA1111")
                .availableAmount(new BigDecimal("15.7"))
                .build();

        var account2 = AccountDto.builder()
                .accountNumber("14895957258124578387")
                .firstName("test")
                .lastName("test")
                .pin("AAA1111")
                .availableAmount(new BigDecimal("357"))
                .build();

        return Arrays.asList(account1,account2);
    }

    public static List<Account> getAccounts() {
        var account1 = Account.builder()
                .accountNumber("14895957258124578399")
                .firstName("test")
                .lastName("test")
                .pin("AAA1111")
                .availableAmount(new BigDecimal("15.7"))
                .status("ACTIVE")
                .build();

        var account2 = Account.builder()
                .accountNumber("14895957258124578387")
                .firstName("test")
                .lastName("test")
                .pin("AAA1111")
                .availableAmount(new BigDecimal("357"))
                .status("ACTIVE")
                .build();

        return Arrays.asList(account1,account2);
    }

}
