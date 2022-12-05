package org.example.data;


public abstract class APerson {
    protected String name;

    public APerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
