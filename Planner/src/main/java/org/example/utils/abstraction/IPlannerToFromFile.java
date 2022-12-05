package org.example.utils.abstraction;

import org.example.data.Schedule;

import java.util.List;

public interface IPlannerToFromFile <P extends Schedule> {
    void writeToFile(String fileName);

    List<P> readFromFile(String fileName);
}
