package pl.sda.zdjavapol15.test;


import java.util.Scanner;

public class ZadaniaZBledem {
    public static void main(String[] args) {
        int[] tabelOfInts = new int[4];

        for (int i = 0; i < 4; i++) {
            tabelOfInts[i] = i;
        }


        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        String someString = scanner.nextLine();
        System.out.println(someString);
    }

}
