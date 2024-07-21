package com.yevstaf.lifelead.lifelead.service;

import com.yevstaf.lifelead.lifelead.api.model.TasksResponse;
import com.yevstaf.lifelead.lifelead.api.model.common.Priority;
import org.springframework.stereotype.Service;

@Service
public class TasksService {

    public TasksResponse queryTasksResponse() {
        return new TasksResponse("SomeTask", Priority.LOW, "Dunno"); //TODO get from DB
    }

    public void saveTasks() {
    }
}
