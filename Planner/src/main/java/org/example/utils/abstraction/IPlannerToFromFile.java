package org.example.utils.abstraction;

import org.example.data.Schedule;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IPlannerToFromFile {
    void writeToFile(String fileName, List<Schedule> schedules) throws IOException;

    List<Schedule> readFromFile(String fileName) throws FileNotFoundException;
}
