package com.kcs.days.first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TreciaUzduotis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreciaUzduotis treciaUzduotis = new TreciaUzduotis();

/*        int selection = scanner.nextInt();
        System.out.println("Jusu pasirinkimas " + selection);*/

while(true) {
    System.out.println("Pasirinkite kokios figuros plota skaiciuosite:\n1. Statciojo trikampio plotas\n2.Staciakampio plotas\n3.Kvadrato plotas\n4.Apskritimo plotas");
    int selectedMenuItem = (int) getCorrectNumb(scanner);

    switch (selectedMenuItem) {
        case 1:
            treciaUzduotis.triangle(scanner);
            break;
        case 2:
            treciaUzduotis.staciakampis(scanner);
            break;
        case 3:
            treciaUzduotis.kvadratas(scanner);
            break;
        case 4:
            treciaUzduotis.apskritimas(scanner);
            break;
        case 0:
            System.exit(0);
        default:
            System.out.println("Neradome Jusu pasirinkimo");
    }
}
    }

    private void triangle(Scanner scanner){
        System.out.println("Iveskite a statini");
        double a = getCorrectNumb(scanner);
        System.out.println("Iveskite b statini");
        double b = getCorrectNumb(scanner);
        System.out.println("Trikampio plotas " + ((a*b)/2));

    }
    private void staciakampis(Scanner scanner){
        System.out.println("Iveskite krastine a");
        double a = getCorrectNumb(scanner);
        System.out.println("Iveskite krastine b");
        double b = getCorrectNumb(scanner);
        System.out.println("Staciakampio plotas yra "+ a*b);
    }
    private void kvadratas(Scanner scanner) {
        System.out.println("Iveskite krastines ilgi");
        double a = getCorrectNumb(scanner);
        System.out.println("Kvadrato plotas yra " + (a * a));
    }
    private void apskritimas(Scanner scanner) {
        System.out.println("Iveskite spinduli");
        double a = getCorrectNumb(scanner);
        System.out.println("Apskritimo plotas yra " + (Math.PI * (a * a)));
    }
    private static double getCorrectNumb(Scanner scanner) {
        double result = 0;
        while (true) {
            try {
                result = scanner.nextDouble();
/*                if (result < 1 || result > 4) {
                    throw new InputMismatchException("Blogas diapozonas ");
                }*/
                break;
            }catch (InputMismatchException e){
                System.out.println("Blogas formatas pakartoti");
                scanner.nextLine();
            }
        }

        return result;
    }
}

