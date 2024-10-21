package academy.devdojo.maratonajava.introducao;
// Operadores = elementos do java que é possivel fazer o peraçoes como operaçoes aritimeticos.

// + - / *

public class Aula04Operadores {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 30;

        double num3 = 5;
        double  num4  = 40;

        int resutSoma = num2 + num1;
        double resutDiv =  num3 /  num4;


        System.out.println(num2 - num1);
        System.out.println(num2 + num1);
        System.out.println(num1 +  "Valor" + num2 + num1);  // operador de adção no sout faz trabalho de concatenação CUIDADO

        System.out.println(resutSoma);
        System.out.println(resutDiv);

        // % - resto de divisao
        int resto = 21 % 7; // se resto da divisão for 0 então o numero é par
        System.out.println(resto);

        //<> <= >= == !=  operadores Relacionais - retornam valor booleano

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);


        // LÓGICOS - (&&) AND - OR (||)

        int idade = 30;
        float salario = 5000.00F;
        boolean isDentrodaLei = idade >= 30 && salario >= 4612;  // DUAS DEVEM RETORNAR TRUE
        System.out.println(isDentrodaLei);

        double valorContaCorrente = 200;
        double valorContaPolpanca = 10000;
        double valorPlaystation = 3000;

        boolean isPlaystationCompravel = valorContaCorrente >= valorPlaystation || valorContaPolpanca <= valorPlaystation; // para ser verdadeiro basta uma primissa ser verdadeira. Só será falso quando todas forem
        System.out.println(isPlaystationCompravel);


        // = += -= *= /= %=  Atribuiçoes antes
        int bonus = 1800;
        bonus += 1000;  // soma
        bonus -= 1000;  //subtração
        bonus *= 5;  // multipicação
        bonus /= 2;  //divisão
        bonus %= 2;  //resto divisão

        System.out.println(bonus);// resultado 0


        //++ --  incremento / decremento
        int contador = 8;
        contador +=1; // contador = contador +1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador);
        System.out.println(++contador2);
    }
}
