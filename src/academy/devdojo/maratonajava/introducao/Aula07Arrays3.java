package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays3 {
    public static void main(String[] args) {
        int [] numero = new int[3];
        int [] numero2 = {1,2,3,4};
        int [] numero3 = new int[]{5,4,3,2};

//        for (int i = 0; i < numero2.length; i++) {
//            System.out.println(numero2[i]);
//        }

        // a simple for without index foreach
        for (int num : numero3) {
            System.out.println(num);
        }
        //
    }
}
