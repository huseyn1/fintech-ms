package az.unibank.ms.fintech.service.impl;

import az.unibank.ms.fintech.dto.UserdDto;
import az.unibank.ms.fintech.exception.BadRequestException;
import az.unibank.ms.fintech.mapper.UserMapper;
import az.unibank.ms.fintech.repository.UserRepository;
import az.unibank.ms.fintech.service.AuthenticationService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private UserRepository userRepository;
    private UserMapper userMapper;
    private PasswordEncoder passwordEncoder;

    @Override
    public String registration(UserdDto userdDto) {
        userdDto.setPassword(passwordEncoder.encode(userdDto.getPassword()));
        var user = userMapper.mapUserDtoToEntity(userdDto);
        var userResp =  userRepository.save(user);
        if (userResp == null) {
            throw new BadRequestException("registration failed");
        }
        return userResp.getFirstName()+"successfully registered";
    }

}
