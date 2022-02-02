package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main{

    public static void main(String[] args) {
     /*
        class Person {
            private String name;
            private String gender;
            private double salary;

            public void setName(String name) {
                this.name = name;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", gender='" + gender + '\'' +
                        ", salary=" + salary +
                        '}';
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            public String getName() {
                return name;
            }

            public String getGender() {
                return gender;
            }

            public double getSalary() {
                return salary;
            }

            public Person(String name, String gender, double salary) {
                this.name = name;
                this.gender = gender;
                this.salary = salary;
            }
        }

        List<Person> persons = List.of(
                new Person("Elsa", "female", 58240),
                new Person("Linda", "female", 29850),
                new Person("Lana", "female", 34850),
                new Person("Hanna", "female", 31400),
                new Person("Bella", "female", 42000),
                new Person("Bärt", "male", 26450),
                new Person("Erik", "male", 37900),
                new Person("Hugo", "male", 43500),
                new Person("Ove", "male", 19750),
                new Person("Peter", "male", 46810)
        );

        // skriv ut snittlönen för kvinnor och för män
        System.out.println(
                persons
                        .stream()
                        .filter(person -> person.getGender().equals("female"))
                        .mapToDouble(Person::getSalary)
                        .summaryStatistics()
                        .getAverage()
        );
        System.out.println(
                persons
                        .stream()
                        .filter(person -> person.getGender().equals("male"))
                        .mapToDouble(Person::getSalary)
                        .summaryStatistics()
                        .getAverage()
        );
        // skriv ut den person som har högst lön
        Person bestPaid = persons
                .stream()
                .max(Comparator.comparing(Person::getSalary))
                .orElseThrow();

        System.out.println(bestPaid);

        // skriv ut den person som har lägst lön

        Person lowPay = persons
                .stream()
                .min(Comparator.comparing(Person::getSalary))
                .orElseThrow();

        System.out.println(lowPay);
    }

    //  2.	Skapa en bilfabrik, med hjälp av factory pattern

    /*

    Volvo volvo = new Volvo();
    Saab saab = new Saab();

    Carfactory2 carfactory = new Carfactory2();

    Car workingCar = carfactory.createCar(Cartype.WORKING);
    Car brokenCar = carfactory.createCar(Cartype.BROKEN);

     brokenCar.carsound();  */

        // 3.Skapa en lista av ord. Använd reguljära uttryck för plocka ut endast de ord
        // som innehåller 2 eller fler engelska vokaler (a, e, i, o, u, y)


        Pattern words = Pattern.compile("[aeiouy]{2}");
        Stream.of("house", "no", "next", "hi", "sail", "beyond", "you")
                .filter(word -> words.matcher(word).find())
                .forEach(System.out::println);

        // 4.	Räkna ut antalet primtal inom intervallet 0 till 500'000. Dela upp intervallet på 2 eller flera trådar,
        // som var för sig räknar på antalet primtal inom sin tilldelade del parallellt.
        // Du kan t.ex. låta en tråd ta en första del (typ 0 till 350'000) och en annan tråd resten  350'001 till 500'000.
        // Det är dock givetvis tillåtet med något eget mer avancerat och effektivt upplägg också.




    }
}





