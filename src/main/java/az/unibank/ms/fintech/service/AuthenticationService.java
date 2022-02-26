package az.unibank.ms.fintech.service;

import az.unibank.ms.fintech.dto.UserdDto;

public interface AuthenticationService {

    UserdDto saveUser(UserdDto userdDto);
}
