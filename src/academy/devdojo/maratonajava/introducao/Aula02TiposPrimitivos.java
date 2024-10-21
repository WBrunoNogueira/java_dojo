package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
    //8 TIPOS PRIMITIVOS - GUARDAM EM MEMORIA UM VALOR SIMPLES (PALAVRAS RESERVAS)
    //int, float, double, char, byte, short, long, boolean

    int age = (int) 10000000000L;
    long numeroGrande  = (long) 1000000000000000L;
    double salario = 20000.0D; // É possivel fazer casta de double para float aumentando a escala de valor
    float salarioFloat = 2500.0F;
    byte idadeByte = 10;
    short idadeShort = 10;
    boolean verdadeiro = true;
    boolean falso = false;
    char caractere = 'A';
    char caractereAsc = 87;  //Tabela AscII
    char caracteraUnicode ='\u0041'; //tabela Unicode


    System.out.println("the age is "+ age + " anos");
    System.out.println(verdadeiro);
    System.out.println(caractereAsc);
    System.out.println(age);




    }
}
