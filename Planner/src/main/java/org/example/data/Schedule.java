package org.example.data;

import org.example.data.abstractions.APerson;
import org.example.data.abstractions.ATask;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс Schedule - расписание отдельного человека, итерируемый по списку задач
 * @param <P>   - класс персон, длz которой формируется расписание
 * @param <T>   - класс задач, назначаемыз персоне
 */
public class Schedule <P extends APerson, T extends ATask> implements Iterable<T>, Serializable {
    private P person;
    private List<T> tasks;

    public Schedule(P person, List<T> tasks) {
        this.person = person;
        this.tasks = tasks;
    }

    public Schedule(P person) {
        this(person, new ArrayList<T>());
    }

    /**
     * Добавление задачи
     * @param task  - добавляемая задача
     */
    public void addTask(T task){
        this.tasks.add(task);
    }

    /**
     * Удаление задачи из списмка
     * @param index - индекс удаляемой задачи
     */
    public void removeTask(int index){
        this.tasks.remove(index);
    }

    /**
     * удаление задачи из списмка
     * @param task  - удаляемая задача
     */
    public void removeTask(T task){
        this.tasks.remove(task);
    }

    public P getPerson() {
        return person;
    }

    public void setPerson(P person) {
        this.person = person;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < tasks.size();
            }

            @Override
            public T next() {
                return tasks.get(index++);
            }

            @Override
            public void remove() {
                tasks.remove(index);
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("ФМО: " + person.getName() + ", Задачи: ");

        for(ATask t : tasks){
            builder.append(tasks.toString() + "\n");
        }

        return builder.toString();
    }
}
