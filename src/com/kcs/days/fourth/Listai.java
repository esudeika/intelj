package com.kcs.days.fourth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listai {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(44);
        numbers.add(333);

        List<String> names = new LinkedList<>();
        names.add("Edvinas");
                names.add("Tadas");
                names.add("Tomas");

                printList(numbers);
    }
    private static void printList(List<Integer> numbers){
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.contains(333));

        numbers.forEach(System.out ::println);


    }
}
