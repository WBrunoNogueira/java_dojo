package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "VolksWagen";
        car1.age = 1995;
        car1.model = "Fusca";

        car2.name = "FIAT";
        car2.age = 2001;
        car2.model = "UNO";

         car1 = car2;
        System.out.println(car1.name + " " + car1.age + " " + car1.model);
        System.out.println(car2.name + " " + car2.age + " " + car2.model);
    }
}
