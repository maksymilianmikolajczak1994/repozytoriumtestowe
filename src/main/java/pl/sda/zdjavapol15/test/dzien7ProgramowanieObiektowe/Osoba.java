package pl.sda.zdjavapol15.test.dzien7ProgramowanieObiektowe;

public class Osoba {

    int yearOfBirth;
    String name;
    String sex;

    public Osoba(int yearOfBirth, String name, String sex){
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.sex = sex;
    }

    public void introduceYourself() {

        System.out.println("Czesc! Mam na imie " + this.name + " i mam " + (2021-yearOfBirth) + " lat. Jestem " + sex);
    }
}
