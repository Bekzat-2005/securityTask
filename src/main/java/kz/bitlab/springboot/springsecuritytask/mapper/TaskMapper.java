package kz.bitlab.springboot.springsecuritytask.mapper;


import kz.bitlab.springboot.springsecuritytask.dto.TaskDto;
import kz.bitlab.springboot.springsecuritytask.model.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto(Task task);
    Task toModel(TaskDto taskDto);
}