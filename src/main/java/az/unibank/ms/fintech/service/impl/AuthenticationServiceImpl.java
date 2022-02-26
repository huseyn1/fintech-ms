package az.unibank.ms.fintech.service.impl;

import az.unibank.ms.fintech.dto.UserdDto;
import az.unibank.ms.fintech.mapper.UserMapper;
import az.unibank.ms.fintech.repository.UserRepository;
import az.unibank.ms.fintech.service.AuthenticationService;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public UserdDto saveUser(UserdDto userdDto) {
        var user = userMapper.mapUserDtoToEntity(userdDto);
        return userRepository.save(user);
    }
}
