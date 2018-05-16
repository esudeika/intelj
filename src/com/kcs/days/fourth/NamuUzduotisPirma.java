package com.kcs.days.fourth;

import java.util.ArrayList;
import java.util.List;

public class NamuUzduotisPirma {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Gediminas");
        names.add("Danas");
        names.add("Arnas");
        names.add("Antanas");
        names.add("Rimvydas");
        getFirst(names);
        getLast(names);

        //names.stream().filter(a -> a.length() > 6).forEach(System.out::println);
        System.out.println(getFirst(names));
        System.out.println(getLast(names));
    }


    private static String getFirst(List<String> names){
        return names.get(0);
    }
    private static String getLast(List<String> names){
        return names.get(names.size()-1);
    }
}
