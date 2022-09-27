package com.company;

import java.text.ParseException;

public class Wolf extends Animal implements Predator {
    public Wolf(Integer serialNumber, String name, String birthday) throws ParseException {
        super(serialNumber, name, birthday);
    }

    @Override
    public String saySomething() {
        return "Growl";
    }
}
