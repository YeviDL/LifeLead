package com.yevstaf.lifelead.lifelead.service;

import com.yevstaf.lifelead.lifelead.api.model.Tasks;
import com.yevstaf.lifelead.lifelead.api.model.common.Priority;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TasksService {

    public List<Tasks> queryTasksResponse() {
        return Arrays.asList(new Tasks("SomeTask", Priority.LOW, "Dunno"),
                new Tasks("SomeOtherTask", Priority.HIGH, "Dunno x2")); //TODO get from DB
    }

    public void saveTasks() {
    }
}
