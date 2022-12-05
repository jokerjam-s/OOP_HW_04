package org.example.data;

import java.time.LocalDateTime;

enum Priority{
    LOW,
    MIDDLE,
    HIGH
}

public abstract class ATask {
    protected Integer id;
    protected String name;
    protected LocalDateTime start;
    protected LocalDateTime deadline;
    protected String notes;
    protected Priority priority;

    public ATask(Integer id, String name, LocalDateTime start, LocalDateTime deadline, String notes, Priority priority) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.deadline = deadline;
        this.notes = notes;
        this.priority = priority;
    }

    public ATask(Integer id, String name, LocalDateTime start, LocalDateTime deadline, String notes) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.deadline = deadline;
        this.notes = notes;
        this.priority = Priority.MIDDLE;
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

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
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
