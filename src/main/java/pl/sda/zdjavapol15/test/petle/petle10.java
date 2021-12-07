package pl.sda.zdjavapol15.test.petle;

//10. Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
//Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
//wysokość choinki (liczbę wierszy). Przykład: dla n = 5 wynik powinien wyglądać
//następująco:
//*
//***
//*****
//*******
//*********

import java.util.Scanner;

public class petle10 {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();

        for (int i = 0; i < number; i++) {
            int ileWstawicSpacji = number - 1 - i;
            int ileMaBycGwiazdek = i * 2 + 1;

            for (int j = 0; j < ileWstawicSpacji; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < ileMaBycGwiazdek; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
