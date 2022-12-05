package org.example.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.data.Schedule;
import org.example.utils.abstraction.IPlannerToFromFile;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PlannerToFromJson implements IPlannerToFromFile {
    @Override
    public void writeToFile(String fileName, List<Schedule> schedules) throws IOException {
        Type typeOfMap = new TypeToken<Schedule>() { }.getType();
        Gson gson = new GsonBuilder().create();

        Logger logger = Logger.getAnonymousLogger();
        List<String> json = new ArrayList<>();

        for (Schedule s: schedules){
            json.add(gson.toJson(s, typeOfMap));
        }

        try {
            Files.write(Paths.get(fileName), json, StandardOpenOption.CREATE);
            logger.info("Сохранен " + fileName);
        }
        catch (Exception ex){
            logger.info(ex.getMessage());
        }
    }

    @Override
    public List<Schedule> readFromFile(String fileName) {
        List<Schedule> schedules = null;
        // Type typeOfList = new TypeToken<ArrayList<Schedule>>() { }.getType();
        Gson gson = new GsonBuilder().create();
        Logger logger = Logger.getAnonymousLogger();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String json = reader.readLine();
            logger.info(json);
            while (json != null) {
                // считываем остальные строки в цикле
                json = reader.readLine();
                schedules.add(gson.fromJson(json, Schedule.class));
                logger.info(json);
            }
            logger.info("Прочитан " + fileName);
        } catch (IOException e) {
            logger.info(e.getMessage());
        }

        return schedules;
    }
}
