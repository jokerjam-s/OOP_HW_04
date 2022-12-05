package org.example.services;

import org.example.data.Schedule;
import org.example.services.abstraction.IPlannerService;
import org.example.utils.PlannerToFromJson;
import org.example.utils.abstraction.IPlannerToFromFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PlannerServiceImpl implements IPlannerService {
    List<Schedule> schedules = new ArrayList<>();

    public void printSchedule(){
        Logger logger = Logger.getAnonymousLogger();
        for (Schedule s : schedules){
            logger.info(s.toString());
        }
    }

    @Override
    public void addShedule(Schedule shedule) {
        schedules.add(shedule);
    }

    @Override
    public void removeShedule(Schedule shedule) {
        schedules.remove(shedule);
    }

    @Override
    public void removeShedule(int index) {
        schedules.remove(index);
    }

    @Override
    public List<Schedule> getScheduleList() {
        return schedules;
    }

    @Override
    public void writeToFile(String fileName, String format){
        IPlannerToFromFile writeToFile = null;

        if(format.equals("json")){
            writeToFile = new PlannerToFromJson();
        }

        if(writeToFile != null){
            try {
                writeToFile.writeToFile(fileName, this.schedules);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Schedule> readFromFile(String fileName, String format) {
        List<Schedule> scheduleList = null;
        IPlannerToFromFile readFromFile = null;

        if(format.equals("json")){
            readFromFile = new PlannerToFromJson();
        }

        if(readFromFile != null){
            try {
                scheduleList = readFromFile.readFromFile(fileName);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        return scheduleList;
    }
}
