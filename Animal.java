package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Animal {
    private Integer serialNumber;
    private String name;
    private Date birthday;

    public Animal(Integer serialNumber, String name, String birthday) throws ParseException {
        this.serialNumber = serialNumber;
        this.name = name;
        this.birthday = new SimpleDateFormat("dd-MM-yyyy").parse(birthday);
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public abstract String saySomething();

}
