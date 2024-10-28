package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao02 {
    public static void main(String[] args) {
        // imprimir todos os numeros pares e 0 até 100000
        int i = 0;
        while (i <= 100000){
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
