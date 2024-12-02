package kz.bitlab.springboot.springsecuritytask.repository;


import kz.bitlab.springboot.springsecuritytask.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {}
