package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Teacher;

public class TeacherTest1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "kami";
        teacher.age = 20;
        teacher.sex = 'M';

        System.out.println(teacher.name + " " + teacher.age + " " + teacher.sex);
    }
}
