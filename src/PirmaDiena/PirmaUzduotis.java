package PirmaDiena;

import java.util.Scanner;

public class PirmaUzduotis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodi");
            word = scanner.nextLine();
            if (word.length() % 2 == 0) {
                System.out.println(" Ivestas zodis " + word + " yra lyginis, rasta raidziu " + countLetters(word, 'a'));
            } else {
                System.out.println("Ivestis zodis " + word + " yra nelyginis, rasta raidziu " + countLetters(word, 'a'));
            }
        } while (!word.equals("pabaiga"));
    }
    private static int countLetters(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
