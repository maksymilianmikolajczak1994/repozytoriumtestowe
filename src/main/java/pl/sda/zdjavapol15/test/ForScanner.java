package pl.sda.zdjavapol15.test;

import java.util.Scanner;

public class ForScanner {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int number = myScanner.nextInt();
        System.out.println("podaj dzielnik");
        int divider = myScanner.nextInt();

        for(int i = number - 1; i > 0; i--){
            if (i % divider == 0){

            System.out.println(i);}
        }


    }
}
