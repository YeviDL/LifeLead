package com.yevstaf.lifelead.lifelead.service;

import com.yevstaf.lifelead.lifelead.api.model.Tasks;
import com.yevstaf.lifelead.lifelead.api.model.common.Priority;
import org.springframework.stereotype.Service;

@Service
public class TasksService {

    public Tasks queryTasksResponse() {
        return new Tasks("SomeTask", Priority.LOW, "Dunno"); //TODO get from DB
    }

    public void saveTasks() {
    }
}
