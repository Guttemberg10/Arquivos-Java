/* Algorítmo que calcula a soma dos quadrados de quatro números
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio02{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1, n2, n3, n4 = 0;// Inicializando as variáveis

        // Lendo 4 números:
        System.out.print("Digite um número: ");
        n1 = leia.nextInt();
        System.out.print("\nDigite outro número: ");
        n2 = leia.nextInt();
        System.out.print("\nDigite mais um número: ");
        n3 = leia.nextInt();
        System.out.print("\nDigite um último número: ");
        n4 = leia.nextInt();
        System.out.print("\nA soma dos quadrados é de "+(Math.pow(n1, 2) + Math.pow(n2, 2) + Math.pow(n3, 2) + Math.pow(n4, 2)));//Imprimindo e somando os quadrados de quatro números
    }
}
