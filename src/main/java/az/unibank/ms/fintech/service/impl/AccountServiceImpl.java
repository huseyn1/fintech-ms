package az.unibank.ms.fintech.service.impl;

import az.unibank.ms.fintech.dto.AccountDto;
import az.unibank.ms.fintech.exception.RecordNotFoundException;
import az.unibank.ms.fintech.mapper.AccountMapper;
import az.unibank.ms.fintech.repository.AccountRepository;
import az.unibank.ms.fintech.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public List<AccountDto> getAccounts(String pin) {
        var accounts =accountRepository
                .findAccountsByAccountNumberAndStatus(pin,"ACTIVE");
        if (accounts.isEmpty()){
            throw new RecordNotFoundException(pin + "dont have active accounts");
        }

        return accountMapper.accountEntityListToDtoList(accounts);
    }
}
