package org.fasttrackit.course7.code.staticCode;

import java.sql.SQLOutput;
import java.util.Random;

public class Factory {
    public static void main(String[] args) {
        Audi[] cars = new Audi[10];
        Random random = new Random();

        for (int index = 0; index < cars.length; index++) {
            cars[index] = new Audi(random.nextInt(500), random.nextInt(10));
        }

        for (Audi audi : cars) {
            System.out.println(audi);
            audi.sellCar();
        }

        System.out.println(Audi.soldCars);

        Audi audi11 = new Audi(466, 5);
        Audi audi12 = new Audi(366, 50);

        System.out.println(Audi.createdCars);

        Audi.howDoYouRoar();

        String[] splitedString = StringUtils.splitString("I.have.an.Audi", "\\.");
        for (String split : splitedString){
            System.out.println(split);
        }
    }
}
