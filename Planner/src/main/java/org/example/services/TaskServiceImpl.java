package org.example.services.abstraction;

import org.example.data.Task;
import org.example.data.abstractions.ATask;
import org.example.data.abstractions.Priority;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskServiceImpl implements ITaskService{
    @Override
    public ATask askTask() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.print("Идентификатор: ");
        Integer id = scanner.nextInt();
        System.out.print("Название: ");
        String name = scanner.nextLine();
        System.out.print("Старт (dd.MM.yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.next(), formatter);
        System.out.print("Дедлайн (dd.MM.yyyy HH:mm): ");
        LocalDateTime deadline = LocalDateTime.parse(scanner.next(), formatter);
        System.out.print("Описание: ");
        String notes = scanner.nextLine();
        System.out.print("Приоритет (1-3): ");
        int p = scanner.nextInt();
        Priority priority = Priority.MIDDLE;
        if(p == 1){
            priority = Priority.LOW;
        } else if (p == 3) {
            priority = Priority.HIGH;
        }

        return new Task(id, name, start, deadline, notes, priority);
    }
}
