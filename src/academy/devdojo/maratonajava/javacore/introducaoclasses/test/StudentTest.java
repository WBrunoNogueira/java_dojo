package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Student;

public class StudentTest {

    public static void main(String[] args) {
        Student p = new Student();

        p.name = "wenderson";
        p.age = 29;
        p.sex = 'm';

        System.out.printf("%s %d %c ",p.name, p.age, p.sex);
    }
}
