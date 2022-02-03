package com.company;

import java.util.regex.Pattern;
import java.util.stream.Stream;

    public class Main {

        public static void main(String[] args) {
        //  2.	Skapa en bilfabrik, med hjälp av factory pattern


            Volvo volvo = new Volvo();
            Saab saab = new Saab();

            Carfactory2 carfactory = new Carfactory2();

            Car workingCar = carfactory.createCar(Cartype.WORKING);
            Car brokenCar = carfactory.createCar(Cartype.BROKEN);

            brokenCar.carsound();

            // 3.Skapa en lista av ord. Använd reguljära uttryck för plocka ut endast de ord
            // som innehåller 2 eller fler engelska vokaler (a, e, i, o, u, y)


            Pattern words = Pattern.compile("[aeiouy]{2}");
                  Stream.of("house", "no", "next", "hi", "sail", "yes")
                 .filter(word -> words.matcher(word).find())
                 .forEach(System.out::println);




        }
    }











