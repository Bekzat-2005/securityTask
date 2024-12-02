package kz.bitlab.springboot.springsecuritytask.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private LocalDate deadlineDate;
    private int status;

    // Getters and setters
}
