package pl.sda.zdjavapol15.test.petle;

//*Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
//danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej
//kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
//podanych liczb oraz ich średnią arytmetyczną.
//a. Spróbuj zadanie zrealizować z tablicą oraz bez tablicy
//b. Pamiętaj! Czytaj liczby tak długo aż wczytana liczba nie jest 0!.

import java.util.Scanner;

public class petle8 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        while (true) {
            int number = myScanner.nextInt();


            if (number == 0) {
                break;
            }
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        int suma = min + max;
        System.out.println("Suma wynosi " + suma);

        double srednia = (min + max) / 2.0;
        System.out.println("Srednia wynosi " + srednia);
    }

}

