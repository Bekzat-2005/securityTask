package kz.bitlab.springboot.springsecuritytask.service;

import kz.bitlab.springboot.springsecuritytask.dto.TaskDto;
import kz.bitlab.springboot.springsecuritytask.mapper.TaskMapper;
import kz.bitlab.springboot.springsecuritytask.model.Task;
import kz.bitlab.springboot.springsecuritytask.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public List<TaskDto> getAllTasks() {
        return taskRepository.findAll().stream()
                .map(taskMapper::toDto)
                .collect(Collectors.toList());
    }

    public TaskDto createTask(TaskDto taskDto) {
        Task task = taskMapper.toModel(taskDto);
        return taskMapper.toDto(taskRepository.save(task));
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}