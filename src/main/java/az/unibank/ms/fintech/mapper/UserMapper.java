package az.unibank.ms.fintech.mapper;

import az.unibank.ms.fintech.dto.UserdDto;
import az.unibank.ms.fintech.entity.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserMapper {

    User mapUserDtoToEntity(UserdDto userdDto);
}
