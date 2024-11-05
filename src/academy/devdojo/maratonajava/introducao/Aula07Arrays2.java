package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays2 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        // new ñ em tipos primitivos
        String[] names = new String[3];
        names[0] = "Jack";
        names[1] = "Muller";
        names[2] = "Dave";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
