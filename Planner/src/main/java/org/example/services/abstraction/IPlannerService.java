package org.example.services.abstraction;

import org.example.data.Schedule;

import java.io.IOException;
import java.util.List;

public interface IPlannerService  {

    public void addShedule(Schedule shedule);
    public void removeShedule(Schedule shedule);
    public void removeShedule(int index);

    public List<Schedule> getScheduleList();

    /**
     * Сохранение текущих расписаний планировщика в файл
     * @param fileName  - файл для сохранения
     * @param format    - формат файла
     */
    void writeToFile(String fileName, String format) throws IOException;

    /**
     * Чтение данных из файла
     * @param fileName
     * @param format
     * @return Спис
     */
    List<Schedule> readFromFile(String fileName, String format);


}
