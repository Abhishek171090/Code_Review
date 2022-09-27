package com.company;

import java.text.ParseException;

public class Cat extends Animal implements Predator {
    public Cat(Integer serialNumber, String name, String birthday) throws ParseException {
        super(serialNumber, name, birthday);
    }

    @Override
    public String saySomething() {
        return "Meow";
    }

}
