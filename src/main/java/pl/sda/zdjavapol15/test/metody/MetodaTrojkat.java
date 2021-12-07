package pl.sda.zdjavapol15.test.metody;

import java.util.Scanner;

public class MetodaTrojkat {

    public static void main(String[] args) {

        int value = loadIntFromUser();
        printTriangleWithSizeN(value);
        System.out.println();
        printSquareWithSizeN(value);

    }

    static int loadIntFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        //return scanner.nextInt(); - krotsza wersja linii 18 i 19

        int loaded = scanner.nextInt();
        return loaded;

    }

    public static void printTriangleWithSizeN(int n) {
        for (int i = 0; i <= n; i++) {

            // petla rysujaca spacje
            for (int k = n; k > i; k--) {
                System.out.print("  ");
            }
            // petla rysujaca gwiazdki
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareWithSizeN(int n) {
        // petla rysujaca gwiazdki
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        }
    }




