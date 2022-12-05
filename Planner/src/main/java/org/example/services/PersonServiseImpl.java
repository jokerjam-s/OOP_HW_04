package org.example.services;

import org.example.data.Person;
import org.example.data.abstractions.APerson;
import org.example.services.abstraction.IPersonService;

import java.util.Scanner;


public class PersonServiseImpl implements IPersonService {
    @Override
    public APerson askPerson() {
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        System.out.print("ИД персоны: ");
        int id = intScanner.nextInt();

        System.out.print("ФИО: ");
        String name = stringScanner.nextLine();

        return new Person(name, id);
    }
}
