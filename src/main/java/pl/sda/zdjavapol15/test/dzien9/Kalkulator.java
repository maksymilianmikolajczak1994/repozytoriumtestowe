package pl.sda.zdjavapol15.test.dzien9;

public class Kalkulator {

    public static void main(String[] args) {
        dodajLiczby(2, 3, 4, 5);

    }


    public static int dodajLiczby(int startingNumber, int... numbers) {
        int result = startingNumber;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;


    }


}
