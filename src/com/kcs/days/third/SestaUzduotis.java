package com.kcs.days.third;


/*Onutei sunkei sekasi mokytis matematiką ir ji neturi skaičiuotuvo, padėkite Onutei ir sukurkite skaičiuotuvą
        kuris atliktu:
        a.       Sumos
        b.      Skirtumo
        c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
        d.      Daugybos
        e.       Kėlimas laipsniu
        Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje.
        Onutei negalima leisti įvesti blogą skaičių ir netinkamą operaciją reikia prašyti pakartoti įvedimą.
        Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class SestaUzduotis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaicius ir veiksma tarp ju. PVZ '12 + 12'");

        String line = scanner.nextLine();

        String[] items = line.split(" ");

        Calculator calculator = new Calculator();

        if (items.length == 3) {
            switch (items[1]) {
                case "+":
                    double numb = getCorrectNumber(items[0], scanner, "Iveskite pirma skaiciu");
                    double numb2 = getCorrectNumber(items[2], scanner, "Iveskite antra skaiciu");
                    System.out.println("Suma " + calculator.suma(numb, numb2));
                    break;
                case "-":
                    //issikviesti atemimo methoda
                    break;
                default:
                    System.out.println("Onute, nera tokio veiksmo");
            }
        } else {
            System.out.println("Nepasiseke, bandykite dar karta");
        }
    }

    private static double getCorrectNumber(String numb, Scanner scanner, String text) {
        double result;
        try {
            result = Double.parseDouble(numb);
        } catch (NumberFormatException e) {
            while (true) {
                System.out.println(text);
                try {
                    result = scanner.nextDouble();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Vesk tik skaiciu Onute");
                    scanner.nextLine();
                }
            }
        }
            return result;

    }
}
