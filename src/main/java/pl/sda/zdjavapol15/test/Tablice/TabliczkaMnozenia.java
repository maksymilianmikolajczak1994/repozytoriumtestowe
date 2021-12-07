package pl.sda.zdjavapol15.test.Tablice;

import java.util.Scanner;

public class TabliczkaMnozenia {
    public static void main(String[] args) {
        int n = wczytajLiczbeOdUsera();
        int m = wczytajLiczbeOdUsera();
        int[][] tabliczka = stworzTabliczkeMnozeniaNnaM(n, m);
        wypiszTablice2D(tabliczka);
    }

    public static int wczytajLiczbeOdUsera() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");


        int loaded = scanner.nextInt();
        return loaded;
    }

    public static int[][] stworzTabliczkeMnozeniaNnaM(int x, int y) {
        int[][] tabliczka = new int[x][y];
        for (int i = 0; i < tabliczka.length; i++) {
            for (int j = 0; j < tabliczka[i].length; j++) {
                tabliczka[i][j] = (i+1) * (j+1);

            }

        }
        return tabliczka;

    }

    public static void wypiszTablice2D(int[][] tablicaDoWypisania) {

       for(int i = 0; i < tablicaDoWypisania.length; i++) {
            for (int j = 0; j < tablicaDoWypisania[1].length; j++) {
                System.out.print(tablicaDoWypisania[i][j] + "\t");
            }
           System.out.println();
       }

    }
}




