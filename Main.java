package com.company;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {


    /*
    Tasks:
    - using existing classes and interfaces and with common sense create dependencies
    - create two instances of each animal and put all of them in the List
    - create Zoo and put all animals in it

    - get from Zoo all Predators, call saySomething() for each of them
    - verify that in Zoo there are any Cat with age more than 5 year


    */

        // write your code here
        System.out.println("Hello world!");

        // create two instances of each animal
        Animal firstCat = new Cat(1, "Lexi", "01-01-2015");
        Animal secondCat = new Cat(2, "Margot", "01-01-2010");

        Animal firstDog = new Dog(3, "Tommy", "01-01-2020");
        Animal secondDog = new Dog(4, "Goldie", "10-10-2021");

        Animal firstRabbit = new Rabbit(5, "Cherry", "05-05-2021");
        Animal secondRabbit = new Rabbit(6, "Poppy", "06-06-2021");

        Animal firstWolf = new Wolf(7, "Artic", "06-07-2018");
        Animal secondWolf = new Wolf(8, "Adolfo", "01-01-2019");

        // put all of them in the List
        /* List<Animal> listOfAllAnimals = new ArrayList<>();
        listOfAllAnimals.add(firstCat);
        listOfAllAnimals.add(secondCat);
        listOfAllAnimals.add(firstDog);
        listOfAllAnimals.add(secondDog);
        listOfAllAnimals.add(firstRabbit);
        listOfAllAnimals.add(secondRabbit);
        listOfAllAnimals.add(firstWolf);
        listOfAllAnimals.add(secondWolf); */

        // create Zoo and put all animals in it
        Zoo zoo = new Zoo();
        zoo.addAnimal(firstCat);
        zoo.addAnimal(secondCat);
        zoo.addAnimal(firstDog);
        zoo.addAnimal(secondDog);
        zoo.addAnimal(firstRabbit);
        zoo.addAnimal(secondRabbit);
        zoo.addAnimal(firstWolf);
        zoo.addAnimal(secondWolf);

        List<Animal> allAnimals = zoo.getAllAnimals();

        // get from Zoo all Predators, call saySomething() for each of them
        for (Animal animal : allAnimals) {
            if (animal instanceof Predator) {
                //System.out.printf("Found a Predator %s that makes %s sound", animal.getName(), animal.saySomething());
                System.out.println("Found a Predator "+animal.getName()+" that makes "+animal.saySomething()+" sound");
            }

        }

        // verify that in Zoo there are any Cat with age more than 5 year
        for (Animal animal : allAnimals) {
            if (animal instanceof Cat) {
//            if (animal.saySomething().equalsIgnoreCase("Meow")) {
                LocalDate localDate = animal.getBirthday().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();

                int age = Period.between(localDate, LocalDate.now()).getYears();
                if (age > 5) {
                    //System.out.printf("%s is of %d years", animal.getName(), age);
                    System.out.println(animal.getName()+"is of  "+age+" years");
                    // Exit Loop once any Cat with age more than 5 years is found
                    break;
                }
            }
        }
    }
}
