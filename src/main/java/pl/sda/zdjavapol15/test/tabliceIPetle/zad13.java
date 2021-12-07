package pl.sda.zdjavapol15.test.tabliceIPetle;

public class zad13 {
    public static void main(String[] args) {
        int height = 10, width = 10;

        for (int i = 0; i < height; i++) {

            // petla rysujaca spacje
            for (int k = height; k > i; k--) {
                System.out.print("  ");
            }
            // petla rysujaca gwiazdki
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}