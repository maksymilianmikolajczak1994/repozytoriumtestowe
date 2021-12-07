package pl.sda.zdjavapol15.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age = myScanner.nextInt();
        if (age > 10) {
            System.out.println("Ile masz wzrostu?");
            int height = myScanner.nextInt();
            myScanner.nextLine();
            if (height > 130) {
                System.out.println("Brawo, mozesz jechac!");
            } else {
                System.out.println("Jestes za niski");
            }

        } else {
            System.out.println("jestes za mlody");
        }

        System.out.println("Jak masz na imie?\n");
        String name = myScanner.nextLine();

        System.out.println("czesc " + name);

    }


}

