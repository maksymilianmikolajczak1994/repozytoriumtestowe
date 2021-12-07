package pl.sda.zdjavapol15.test;

import java.util.Scanner;

public class WhileExercise {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int maxNumber = myScanner.nextInt();
        int sum = 0;
        while (maxNumber > 0) {
            sum += maxNumber;
            maxNumber--;

        }
        System.out.println(sum);
    }
}
