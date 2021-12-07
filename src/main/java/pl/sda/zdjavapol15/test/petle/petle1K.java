package pl.sda.zdjavapol15.test.petle;


//litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest
//podzielny przez 5

public class petle1K {
    public static void main(String[] args) {

        for (char znak = 'b'; znak <= 'z'; znak += 2) {
            if (znak % 5 == 0) {
                System.out.println(znak);
            }
        }
        System.out.println("=============");

        char znak = 'b';
        while (znak <= 'z') {
            if (znak % 5 == 0) {
                System.out.println(znak);
            }
            znak += 2;
        }


        System.out.println("=============");

        for (int i = 97; i <= 122; i++) {
            System.out.println(i);
            char c = (char) i;
            System.out.println((char) i);
        }

    }
}
