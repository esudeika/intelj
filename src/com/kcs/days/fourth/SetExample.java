package com.kcs.days.fourth;

import java.util.HashSet;
import java.util.Set;

public class SetExample {


    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();
        number.add(12);
        number.add(34);
        number.add(1);
        number.add(12);

        number.forEach(System.out :: println);

        Person p = new Person("Edvinas", "Sudeika", 11);

        Set<Person> persons = new HashSet<>();
        persons.add(p);
        persons.add(new Person("Jonas", "Jonaitis", 67 ));
        persons.add(p);

        persons.forEach(a -> System.out.println(a.getName() + " " + a.getSurname() + " " + a.getAge()));
    }
}