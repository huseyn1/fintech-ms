package az.unibank.ms.fintech.service.impl;

import az.unibank.ms.fintech.exception.RecordNotFoundException;
import az.unibank.ms.fintech.mapper.AccountMapper;
import az.unibank.ms.fintech.mock.MockData;
import az.unibank.ms.fintech.repository.AccountRepository;
import az.unibank.ms.fintech.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(classes = {
        AccountServiceImpl.class,
        AccountRepository.class,
        AccountMapper.class
})
public class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    @MockBean
    private AccountRepository accountRepository;

    @MockBean
    private AccountMapper accountMapper;

    @Test
    void shouldReturnActiveAccounts_whenSuccessDataFound() {
        String pin = "AAA1111";
        String status = "ACTIVE";
        when(accountRepository.findAccountsByPinAndStatus(pin,status))
                .thenReturn(MockData.getAccounts());
        when(accountMapper.accountEntityListToDtoList(MockData.getAccounts()))
                .thenReturn(MockData.getAccountDtos());

        var response = accountService.getAccounts(pin);

        assertThat(response.size())
                .isEqualTo(2);
    }

    @Test
    void shouldReturnException_whenNoDataFound() {
        String pin = "111AAAA";
        String status = "DEACTIVE";

        when(accountRepository.findAccountsByPinAndStatus(pin,status))
                .thenReturn(Collections.emptyList());
        when(accountMapper.accountEntityListToDtoList(MockData.getAccounts()))
                .thenReturn(Collections.emptyList());

        assertThrows(RecordNotFoundException.class, () ->
                accountService.getAccounts(pin));
    }
}