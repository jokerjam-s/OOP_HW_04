package org.example.utils;

import org.example.data.Schedule;
import org.example.utils.abstraction.IPlannerToFromFile;

import java.util.List;

/**
 * Сохранение / Чтение записей планировщика в формат xml
 */
public class PlannerToFromXml implements IPlannerToFromFile {
    @Override
    public void writeToFile(String fileName) {

    }

    @Override
    public List<Schedule> readFromFile(String fileName) {
        return null;
    }
}
