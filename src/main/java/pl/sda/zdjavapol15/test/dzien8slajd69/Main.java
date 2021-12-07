package pl.sda.zdjavapol15.test.dzien8slajd69;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        SuperBohater spiderman = new SuperBohater("spiderman", "pajeczyna");
        SuperBohater batman = new SuperBohater("batman", "batmobil");
        SuperBohater superman = new SuperBohater("superman", "laser");

        // 4.a

        spiderman = batman;
        spiderman = null;
        System.out.println(batman == null);

        // 4.b

        spiderman = null;
        batman = spiderman;
        spiderman = superman;
        System.out.println(spiderman == null);
        System.out.println(batman == null);
        System.out.println(superman == null);

        // 5.a
        String name = "macius";
        String name1 = "macius";
        int wiek = 10;
        int wiek1 = 20;

        if (name.equals(name1)) {
            System.out.println("brawo!!");
        } else {
            System.out.println("dupa");
        }
        System.out.println(name == name1);
        System.out.println(name);
        System.out.println();

        System.out.println(random.nextDouble() * 10 + 10);



    }
}
