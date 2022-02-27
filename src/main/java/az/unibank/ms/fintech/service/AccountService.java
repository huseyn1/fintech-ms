package az.unibank.ms.fintech.service;

import az.unibank.ms.fintech.dto.AccountDto;

import java.util.List;

public interface AccountService {

    List<AccountDto> getAccounts(String pin);

}
