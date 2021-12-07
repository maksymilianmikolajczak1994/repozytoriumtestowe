package pl.sda.zdjavapol15.test.metody;

import java.util.Scanner;

public class MojePierwszeMetody {

    public static void main(String[] args) {
        System.out.println("12345");

        mojaNowaMetoda();

        mojaDrugaMetoda(5);
        System.out.println("=========");
        mojaDrugaMetoda(10);
        System.out.println("=========");

        mojaMetodaKtoraWypisujePomnozoneLiczby(3, 5);
        int a = 9;
        int b = 2;
        mojaMetodaKtoraWypisujePomnozoneLiczby(5, 6);
        System.out.println("a w main = " + a);
        System.out.println("b w main = " + b);

        System.out.println("=====================");

        int x = mojaMetodaKtoraZwracaWynikMnozeniaLiczb(4, 8);
        System.out.println(x);

        mojaMetodaKtoraZwracaWynikMnozeniaLiczb(8, 12);


        System.out.println("=====================");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Podaj 1-sza liczbe: ");
        int zm1 = myScanner.nextInt();

        System.out.println("Podaj 2-ga liczbe: ");
        int zm2 = myScanner.nextInt();

        wypiszTabliceMnozenia(zm1, zm2);

//        dla zaawansowanych!
//        System.out.println(args[0]);
// dla bardzo chetnych - sprobowac odpalic ten program z lini polecen, podajac argument
    }

    static void wypiszTabliceMnozenia(int a, int b) {
        for(int i=1; i<=a; i++) {
            for(int j=1; j<=b; j++) {
                System.out.print(i*j + "\t"); // \t -> znak tabulatora
            }
            System.out.println();
        }
    }

    // void - nie zwraca nic
    static void mojaNowaMetoda() {
        System.out.println("Pozdrawiam z metody");
    }

    static void mojaDrugaMetoda(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("Wypisuje cokolwiek");
            mojaNowaMetoda();
        }
    }

    static void mojaMetodaKtoraWypisujePomnozoneLiczby(int a, int b) {
        System.out.println("a w metodzie = " + a);
        System.out.println("b w metodzie = " + b);

        System.out.println(a * b);
    }

    static void mojaMetodaKtoraWypisujeDodaneLiczby(int a, int b) {
        System.out.println(a + b);
    }

    // int - zwraca wartosc typu int
    static int mojaMetodaKtoraZwracaWynikMnozeniaLiczb(int a, int b) {
        int result = a * b;
        return result;
    }
}


    








