/* Algorítmo que facilita a venda de picolés
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio06{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int q_kiwi, q_laranja, q_roma = 0;// Variáveis para a quantidade de cada sabor de sorvete
       
        // Lendo a quantidade de cada sabor de sorvete que o cliente comprou:
        System.out.print("Digite quantos picolés de Kiwi você comprou: ");
        q_kiwi = leia.nextInt();
        System.out.print("Digite quantos picolés de Laranja você comprou: ");
        q_laranja = leia.nextInt();
        System.out.print("Digite quantos picolés de Romã você comprou: ");
        q_roma = leia.nextInt();
       
        // Imprimindo e calculando o valor total da compra:
        System.out.print("Valor total da compra: "+((q_kiwi * 3.2) + (q_laranja * 2.39) + (q_roma * 7.99)));
    }
}
