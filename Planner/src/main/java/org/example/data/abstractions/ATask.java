package org.example.data.abstractions;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class ATask {
    protected Integer id;
    protected String name;
    protected String start;
    protected String deadline;
    protected String notes;
    protected Priority priority;

    public ATask(Integer id, String name, String start, String deadline, String notes, Priority priority) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.deadline = deadline;
        this.notes = notes;
        this.priority = priority;
    }

    public ATask(Integer id, String name, String start, String deadline, String notes) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.deadline = deadline;
        this.notes = notes;
        this.priority = Priority.MIDDLE;
    }

    public ATask() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
