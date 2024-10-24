package academy.devdojo.maratonajava.introducao;

// swich
public class Aula05EstruturasCondicionais5 {
    public static void main(String[] args) {
        // impima o dia da semana considerando 1 como domingo
        byte dia = 5;
        //char, int, byte, short, enum, String
        // OBS: se não por o break o switch continua
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("opção invalida");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("HOMEM");
            case 'F':
                System.out.println("MULHER");
            default:
                System.out.println("Inválido");
        }
    }
}
