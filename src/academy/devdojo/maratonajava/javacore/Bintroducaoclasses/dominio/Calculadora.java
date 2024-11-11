package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

import static java.lang.System.*;

public class Calculadora {

    public void somaDoisNumeros(){
        out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        out.println(8-5);
    }
    public void multiplica(int num1 , float num2){ //parametr
        out.println(num1+ num2);
    }
    public double divideNumero(double num1 , double num2){
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
    public double divideNumero2(double num1 , double num2){
        if (num2 != 0) {

            return num1 / num2;
        }
        return 0;


    }
    public void alteraNumero(int num1, int num2){
        num1 = 99;
        num2 = 50;
        out.println("esses são os valores de num1 e num2 " + num1 + num2);

    }
}
