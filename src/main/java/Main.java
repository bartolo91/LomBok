import pl.kurs.Employee;
import pl.kurs.Manager;
import singular.Course;
import singular.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("jan", "kowalski", 555, "a12341234");

        System.out.println(e);

        Manager m = new Manager("jan", "kowalski", 555, "a12341234", 555);
        System.out.println(m);

        Student s1 = new Student("janek", "aa");
        Student s2 = new Student("janek2", "aa2");
        Student s3 = new Student("janek3", "aa3");

        Course c1 = Course.builder()
                .name("java")
                .location("wawa")
                .studentList(List.of(s1,s2,s3))
                .build();

        Course c2 = Course.builder()
                .name("java")
                .location("wawa")
                .studentList(s1)
                .studentList(s2)
                .studentList(s3)
                .build();

        System.out.println(c1);
        System.out.println(c2);

        /*
         * Stworz klase Piwo (marka, cena, jakosc piany, lista skladnikow, opcjonalna zawartosc alkoholu)
         * Stworz klase Alkoholik (imie, nazwisko, lista piw (asocjacja)).
         *
         * Piwo ma wyswietlac tylko marke i cene.
         *
         * Alkoholik ma wyswietlac tylko imie i nazwisko
         *
         * W piwie marka ma byc polem niemodyfikowalnym
         *
         * Dwa piwa sa takie same jesli marka i cena jest taka sama
         *
         * Uzyj buildera do tworzenia obiektow + powiazan
         */


    }
}
