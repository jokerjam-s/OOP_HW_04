package org.example.services.abstraction;

import org.example.data.Schedule;

import java.util.List;

public interface IPlannerService <E extends Schedule> {

    public void addShedule(E shedule);
    public void removeShedule(E shedule);
    public void removeShedule(int index);

    public List<E> getScheduleList();

    /**
     * Сохранение текущих расписаний планировщика в файл
     * @param fileName  - файл для сохранения
     * @param format    - формат файла
     */
    void writeToFile(String fileName, String format);

    /**
     * Чтение данных из файла
     * @param fileName
     * @param format
     * @return Спис
     */
    List<E> readFromFile(String fileName, String format);


}
