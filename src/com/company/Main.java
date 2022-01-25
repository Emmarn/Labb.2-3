package com.company;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

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

    // 2.	Skapa en bilfabrik, med hjälp av factory pattern

    //Volvo volvo = new Volvo();
    //Saab saab = new Saab();
    Carfactory2 carfactory = new Carfactory2();
    Car workingCar = carfactory.createCar(cartype.WORKING);

    workingCar.carsound();

    }



}
