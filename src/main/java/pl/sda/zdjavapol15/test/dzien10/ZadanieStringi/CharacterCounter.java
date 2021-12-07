package pl.sda.zdjavapol15.test.dzien10.ZadanieStringi;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        String loadedString = loadStringFromUser();
        countAndPrintCharacterOccurences(loadedString);
    }

    private static void countAndPrintCharacterOccurences(String loadedString) {
        int[] characterOccurences = new int[58];
        for (int i = 0; i < loadedString.length(); i++) {
            int valueOfCharacter = loadedString.charAt(i);
            if (((valueOfCharacter >= 65) && (valueOfCharacter <= 98)) ||
                    ((valueOfCharacter >= 97) && (valueOfCharacter <= 102))) {
                characterOccurences[valueOfCharacter - 65] += 1;
            }
        }

        for (int i = 0; i < characterOccurences.length; i++) {
            int valueOfCharacter = i + 65;
            char character = (char) valueOfCharacter;
            if (((valueOfCharacter >= 65) && (valueOfCharacter <= 98)) ||
                    ((valueOfCharacter >= 97) && (valueOfCharacter <= 102))) {
                System.out.println("Litera " + character + " wystapila w podanym wyrazie " + characterOccurences[i] + " razy");
            }
        }


    }

    private static String loadStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
}
