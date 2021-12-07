package pl.sda.zdjavapol15.test;

import java.util.Scanner;

public class ForScannerTwo {

    public static void main(String[] args) {

        Scanner ourScanner = new Scanner(System.in);
        System.out.println("Podaj podstawe potegi");
        int m = ourScanner.nextInt();
        System.out.println("Podaj wykladnik");
        int n = ourScanner.nextInt();
        int wynik = 1;
        for (int i = 0; i < n; i++){
            wynik = wynik * m;
        }
        System.out.println(wynik);

    }
}
