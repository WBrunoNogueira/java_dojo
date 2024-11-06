package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimenssionais1 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 52;
        dias[0][1] = 55;
        dias[0][2] = 88;

        dias[1][0] = 10;
        dias[1][1] = 10;
        dias[1][2] = 10;

        dias[2][0] = 89;
        dias[2][1] = 78;
        dias[2][2] = 789;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);

            }
        }

        System.out.println("--------------------------------------");
        for (int [] arrayBase :  dias){ //reference variable FOREACH
            for (int num : arrayBase){
                System.out.println(num);
            }
        }

    }
}



