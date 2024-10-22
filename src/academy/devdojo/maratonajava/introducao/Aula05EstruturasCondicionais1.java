package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais1 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;  // condição passa para a varavel declarada

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado beber");
        }else {
            System.out.println("Ñ autorizado beber");
        }
        /*
        if (!isAutorizadoComprarBebida) {  // negação do boolean
            System.out.println("Ñ autorizado beber");
        }
        */
        boolean c = false;
        if (c = true) {  // reatribuição do boolean
            System.out.println("Executado");
        }
    }
}
