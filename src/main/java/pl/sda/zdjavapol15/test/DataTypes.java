package pl.sda.zdjavapol15.test;

public class DataTypes {
    public static void main(String[] args) {
        String name = "Hi";
        int age = 10;
        char letter = 'M';
        if (age >= 10) {
            System.out.println("Gratulacja, jestes duzym chlopcem!");
        } else {
            System.out.println("Przykro mi, jestes malutkim chlopcem :(");
        }
        switch (name) {
            case "Maks":
                System.out.println("Czesc Maks!");
                break;
            case "Janek":
                System.out.println("Czesc Janek!");
                break;
            default:
                System.out.println("Czesc nieznajomy!");
                break;
        }
        age = 20;
        age = 30;
        System.out.println(age + letter + name);
        System.out.println(age + 77 + name);
        char zmienna = 'P';

        System.out.println("Kod ASCII litery " + zmienna + " , to :" + (int) zmienna);
    }
}
