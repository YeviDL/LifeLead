package com.yevstaf.lifelead.lifelead.api.controller;

import com.yevstaf.lifelead.lifelead.api.model.TasksResponse;
import com.yevstaf.lifelead.lifelead.service.TasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class TaskController {

    private final TasksService tasksService;

    @GetMapping("/tasks")
    public TasksResponse getTasks() {

        return tasksService.queryTasksResponse();
    }

    @PutMapping("/tasks")
    public void putTasks() {
        tasksService.saveTasks();
    }
}
