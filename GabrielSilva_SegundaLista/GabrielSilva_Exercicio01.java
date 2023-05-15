/* Algorítmo que calcula o desconto de um produto
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio01{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double valor = 0.0;
        System.out.print("Digite um valor em R$");
        valor = leia.nextDouble();
        System.out.print("\nValor original: R$"+valor+"\nValor com desconto: R$"+(valor - (0.15 * valor)));
    }
}
