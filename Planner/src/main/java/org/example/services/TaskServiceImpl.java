package org.example.services;

import org.example.data.Task;
import org.example.data.abstractions.ATask;
import org.example.data.abstractions.Priority;
import org.example.services.abstraction.ITaskService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskServiceImpl implements ITaskService {
    @Override
    public ATask askTask() {
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.print("Идентификатор: ");
        Integer id = intScanner.nextInt();
        System.out.print("Название: ");
        String name = stringScanner.nextLine();
        System.out.print("Старт (dd.MM.yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(stringScanner.nextLine(), formatter);
        System.out.print("Дедлайн (dd.MM.yyyy HH:mm): ");
        LocalDateTime deadline = LocalDateTime.parse(stringScanner.nextLine(), formatter);
        System.out.print("Описание: ");
        String notes = stringScanner.nextLine();
        System.out.print("Приоритет (1-3): ");
        int p = intScanner.nextInt();
        Priority priority = Priority.MIDDLE;
        if(p == 1){
            priority = Priority.LOW;
        } else if (p == 3) {
            priority = Priority.HIGH;
        }

        return new Task(id, name, start, deadline, notes, priority);
    }
}
