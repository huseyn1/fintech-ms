package az.unibank.ms.fintech.repository;

import az.unibank.ms.fintech.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
