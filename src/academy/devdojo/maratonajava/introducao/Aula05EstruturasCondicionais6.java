package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais6 {
    public static void main(String[] args) {
        // EXERCICIO - usando swich dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo

        byte diaSemana = 5;
        switch (diaSemana) {
            case 1:
            case 7:
                System.out.println("final de semana");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("invalido");
        }
    }
}
