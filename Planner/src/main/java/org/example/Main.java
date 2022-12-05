package org.example;

import org.example.data.Schedule;
import org.example.services.PersonServiseImpl;
import org.example.services.PlannerServiceImpl;
import org.example.services.TaskServiceImpl;

public class Main {
    public static void main(String[] args) {
        PersonServiseImpl personServise = new PersonServiseImpl();
        TaskServiceImpl taskService = new TaskServiceImpl();
        PlannerServiceImpl plannerService = new PlannerServiceImpl();

        for (int i = 0; i < 2; i++) {
            Schedule schedule = new Schedule(personServise.askPerson());

            for (int j = 0; j < 3; j++) {
                schedule.addTask(taskService.askTask());
            }
            plannerService.addShedule(schedule);
        }

        plannerService.printSchedule();
        plannerService.writeToFile("Shedule.json", "json");

    }
}