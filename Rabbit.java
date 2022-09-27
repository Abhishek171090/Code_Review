package com.company;

import java.text.ParseException;

public class Rabbit extends Animal implements Herbivore {
    public Rabbit(Integer serialNumber, String name, String birthday) throws ParseException {
        super(serialNumber, name, birthday);
    }

    @Override
    public String saySomething() {
        return "Purr";
    }
}
