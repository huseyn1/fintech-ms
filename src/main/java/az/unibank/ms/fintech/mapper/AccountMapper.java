package az.unibank.ms.fintech.mapper;

import az.unibank.ms.fintech.dto.AccountDto;
import az.unibank.ms.fintech.entity.Account;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface AccountMapper {

    AccountDto accountEntityToDto(Account account);

    List<AccountDto> accountEntityListToDtoList(List<Account> accounts);

}
