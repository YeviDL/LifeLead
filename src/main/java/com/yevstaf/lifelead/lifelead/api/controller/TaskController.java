package com.yevstaf.lifelead.lifelead.api.controller;

import com.yevstaf.lifelead.lifelead.api.model.Tasks;
import com.yevstaf.lifelead.lifelead.service.TasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class TaskController {

    private final TasksService tasksService;

    @GetMapping("/tasks")
    public Tasks getTasks() {

        return tasksService.queryTasksResponse();
    }

    @PutMapping("/tasks")
    public void putTasks(@RequestBody Tasks task) {
        tasksService.saveTasks();
    }
}
