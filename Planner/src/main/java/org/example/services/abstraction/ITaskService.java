package org.example.services.abstraction;

import org.example.data.abstractions.ATask;

public interface ITaskService <T extends ATask> {
    T askTask();
}
