package az.unibank.ms.fintech.repository;

import az.unibank.ms.fintech.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,String> {

    List<Account> findAccountsByAccountNumberAndStatus(String accountNumber,String status);

}
