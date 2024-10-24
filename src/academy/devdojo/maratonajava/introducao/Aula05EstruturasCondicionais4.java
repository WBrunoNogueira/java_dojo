package academy.devdojo.maratonajava.introducao;
/*
* Renda Anual	Alíquota
$22,001 – $89,450	$2,200 + 12% do valor acima de $22,000
$89,451 – $190,750	$10,294 + 22% do valor acima de $89,450
$190,751 – $364,200	$32,580 + 24% do valor acima de $190,750
$364,201 – $462,500	$74,208 + 32% do valor acima de $364,200
*
* */

public class Aula05EstruturasCondicionais4 {

    public static void main(String[] args) {
        double salarioAnual= 200;
        double valorImposto =0;
        double faixa1 = (double)  0.10;
        double faixa2 =  (double) 0.12;
        double faixa3 = (double) 0.22;
        double faixa4 = (double) 0.24;

        if (salarioAnual <= 20.55) {
            valorImposto = (salarioAnual *faixa1);
        } else if (salarioAnual >= 20.56 && salarioAnual<= 83.55) {
            valorImposto = (salarioAnual * faixa2) + 2.05;
        } else if (salarioAnual >= 83.56 && salarioAnual <= 178.15) {
            valorImposto = (salarioAnual * faixa3) + 9.61 ;
        } else if (salarioAnual >= 178.16 && salarioAnual <= 340.10) {
            valorImposto = (salarioAnual * faixa4) + 30.42;
        } else if (salarioAnual >= 340.11) {
            valorImposto = salarioAnual * faixa4;
        }
        System.out.printf("O Contribuinte com renda anual de %.2f irá pagar %.2f de imposto!", salarioAnual, valorImposto);


        //System.out.printf(" %.2f  %.2f  %.2f  %.2f", faixa1 , faixa2 , faixa3 , faixa4);


    }
}
