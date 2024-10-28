package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao03 {
    // imprima os primeiros 25 numeros de ua dado valor pro exemplo 50;
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax ; i++) {
            if (i > 25) {
                 break; // para no 25
            }
            System.out.println(i);
        }
    }
}
