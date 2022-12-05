package org.example.data;

import org.example.data.abstractions.ATask;
import org.example.data.abstractions.Priority;

import java.time.LocalDateTime;

public class Task extends ATask {

    public Task(Integer id, String name, LocalDateTime start, LocalDateTime deadline, String notes, Priority priority) {
        super(id, name, start, deadline, notes, priority);
    }

    public Task(Integer id, String name, LocalDateTime start, LocalDateTime deadline, String notes) {
        super(id, name, start, deadline, notes);
    }

    @Override
    public String toString() {
        return "Задача [" +
                "id=" + id +
                ", '" + name + '\'' +
                ", " + start +
                " - " + deadline +
                ", '" + notes + '\'' +
                ", " + priority +
                ']';
    }
}
