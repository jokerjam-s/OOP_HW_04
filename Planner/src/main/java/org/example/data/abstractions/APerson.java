package org.example.data.abstractions;


import java.io.Serializable;

public abstract class APerson {
    protected String name;

    public APerson(String name) {
        this.name = name;
    }

    public APerson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
