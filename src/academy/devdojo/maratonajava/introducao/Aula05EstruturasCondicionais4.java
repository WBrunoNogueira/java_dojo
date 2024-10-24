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

        double faixa1 =  (double) 12 / 100;
        double faixa2 = (double) 22 / 100;
        double faixa3 = (double) 24 / 100;
        double faixa4 = (double) 32 / 100;
        double valorImposto = 0.00;

        if (salarioAnual >= 22.001 && salarioAnual<= 89.450) {
            valorImposto = salarioAnual * faixa1;
        } else if (salarioAnual >= 89.451 && salarioAnual <= 190.750) {
            valorImposto = salarioAnual * faixa2;
        } else if (salarioAnual >= 190.751 && salarioAnual <= 364.200) {
            valorImposto = salarioAnual * faixa3;
        } else if (salarioAnual >= 364.201) {
            valorImposto = salarioAnual * faixa4;
        }else {
            System.out.println("Isento de imposto");
        }
        System.out.printf("O Contribuinte com renda anual de %.2f irá pagar %.2f de imposto!", salarioAnual, valorImposto);


        //System.out.printf(" %.2f  %.2f  %.2f  %.2f", faixa1 , faixa2 , faixa3 , faixa4);


    }
}
