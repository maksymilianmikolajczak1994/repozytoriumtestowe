package pl.sda.zdjavapol15.test.dzien9.regexy;

import java.util.Scanner;

public class StringEdit {
    public static void main(String[] args) {
        String loaded = loadTextFromUser();

        zadA(loaded);
        zadB(loaded);
        zadC(loaded);
        zadD(loaded);
        zadE(loaded);
        zadF(loaded);

    }

    private static String loadTextFromUser() {
        System.out.println("Podaj text");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean zadA(String loaded) {
        boolean zawiera = loadTextFromUser().contains("ania");
        return zawiera;

    }

    private static boolean zadB(String loaded) {
        boolean zaczyna = loadTextFromUser().startsWith("ania");
        return zaczyna;

    }

    private static boolean zadC(String loaded) {
        boolean konczy = loadTextFromUser().endsWith("ania");
        return konczy;

    }

    private static boolean zadD(String loaded) {
        boolean rowne = loadTextFromUser().equals("ania");
        return rowne;

    }

    private static boolean zadE(String loaded) {
        loadTextFromUser().toLowerCase();
        boolean zawiera = loadTextFromUser().contains("ania");
        return zawiera;

    }

    private static int zadF(String loaded) {
        int ktoryWiersz = loadTextFromUser().indexOf("ania");

        return ktoryWiersz;

    }
}


