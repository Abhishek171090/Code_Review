package com.company;

import java.text.ParseException;

public class Dog extends Animal implements Predator {
    public Dog(Integer serialNumber, String name, String birthday) throws ParseException {
        super(serialNumber, name, birthday);
    }

    @Override
    public String saySomething() {
        return "Bark";
    }
}
