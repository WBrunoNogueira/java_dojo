package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Calculadora;
// passagem de parametro de tipos primitivos
public class CalculadoraTeste4 {
    public static void main(String[] args) {
        Calculadora calculador =new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculador.alteraNumero(num1,num2);
        System.out.printf("%d %d" , num1 , num2);

    }
}
