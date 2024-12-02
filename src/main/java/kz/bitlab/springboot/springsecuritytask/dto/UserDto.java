package kz.bitlab.springboot.springsecuritytask.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private List<Long> taskIds; // Список ID задач
}