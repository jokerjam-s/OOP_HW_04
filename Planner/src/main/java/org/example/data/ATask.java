package org.example.data;

import java.util.Date;

enum Priority{
    LOW,
    MIDDLE,
    HIGH
}

public abstract class ATask {
    private String name;
    private Date regDate;
    private Date deadline;
    private String notes;
    private Priority priority;


    public ATask(String name, Date regDate, Date dedline, String notes, Priority priority) {
        this.name = name;
        this.regDate = regDate;
        this.deadline = dedline;
        this.notes = notes;
        this.priority = priority;
    }

    public ATask(String name, Date regDate, Date dedline, String notes) {
        this.name = name;
        this.regDate = regDate;
        this.deadline = dedline;
        this.notes = notes;
        this.priority = Priority.MIDDLE;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
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
