package org.example.data;

import java.util.ArrayList;
import java.util.List;

public abstract class Schedule <T extends APerson, E extends ATask> {
    private Person person;
    private List<ATask> tasks;

    public Schedule(Person person, List<ATask> tasks) {
        this.person = person;
        this.tasks = tasks;
    }

    public Schedule() {
        this(new Person(), new ArrayList<>());
    }
}
