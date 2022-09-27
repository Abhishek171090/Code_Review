package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private final Map<Integer, Animal> animals;  // integer is a serial number of Animal in thr Zoo

    public Zoo() {
        this.animals = new HashMap<Integer, Animal>();
    }

    public void addAnimal(Animal animal) {
        if (animal != null) {
            this.animals.put(animal.getSerialNumber(), animal);
        }
    }

    public List<Animal> getAllAnimals() {
        List<Animal> allAnimals = new ArrayList<>();
        for (Integer key : this.animals.keySet()) {
            allAnimals.add(this.animals.get(key));
        }
        return allAnimals;
    }
}
