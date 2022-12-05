package org.example.services;

import org.example.data.Schedule;
import org.example.services.abstraction.IPlannerService;
import org.example.utils.PlannerToFromJson;
import org.example.utils.PlannerToFromXml;
import org.example.utils.abstraction.IPlannerToFromFile;

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
    public void writeToFile(String fileName, String format) {
        IPlannerToFromFile writeToFile = null;

        if(format.equals("json")){
            writeToFile = new PlannerToFromJson();
        } else if (format.equals("xml")) {
            writeToFile = new PlannerToFromXml();
        }

        if(writeToFile != null){
            writeToFile.writeToFile(fileName);
        }
    }

    @Override
    public List<Schedule> readFromFile(String fileName, String format) {
        List<Schedule> scheduleList = null;
        IPlannerToFromFile readFromFile = null;

        if(format.equals("json")){
            readFromFile = new PlannerToFromJson();
        } else if (format.equals("xml")) {
            readFromFile = new PlannerToFromXml();
        }

        if(readFromFile != null){
           scheduleList = readFromFile.readFromFile(fileName);
        }

        return scheduleList;
    }
}
