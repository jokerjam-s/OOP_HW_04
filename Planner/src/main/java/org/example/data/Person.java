package org.example.data;

import org.example.data.abstractions.APerson;

import java.util.Objects;

public class Person extends APerson {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person(String name, Integer id) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("[%s, id=%d]", this.name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
