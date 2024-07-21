package com.yevstaf.lifelead.lifelead.api.model;

import com.yevstaf.lifelead.lifelead.api.model.common.Priority;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TasksResponse {

    private String name;
    private Priority priority;
    private String description;
}
