package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        // idade < 15 categoria juvenil
        // idade >= && idade < 18 categoria juvenil
        //idade >=18 categoria adulta

        //obs: variaveis locais precisão ser inicializadas pois é possivel que elas não sejam utilizadas causando um ero
        int idade = 17;
        String categoria;
        if (idade < 15){
        categoria ="Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria ="Categoria Juvenil";
        }else {
        categoria = "categoria Adulto";
        }
        System.out.println(categoria);
    }
}
