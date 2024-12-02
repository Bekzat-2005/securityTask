package kz.bitlab.springboot.springsecuritytask.mapper;


import kz.bitlab.springboot.springsecuritytask.dto.UserDto;
import org.mapstruct.Mapper;
import org.springframework.security.core.userdetails.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

}
