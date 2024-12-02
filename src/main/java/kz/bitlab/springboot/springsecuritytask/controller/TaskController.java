package kz.bitlab.springboot.springsecuritytask.controller;


import kz.bitlab.springboot.springsecuritytask.dto.TaskDto;
import kz.bitlab.springboot.springsecuritytask.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public List<TaskDto> getTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public TaskDto addTask(@RequestBody TaskDto taskDto) {
        return taskService.createTask(taskDto);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
