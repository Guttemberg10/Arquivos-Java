/* Algorítmo que recebe 4 números e soma-os
   Gabriel Novais
   05/05/2023
*/
import java.util.Scanner;

public class GabrielSilva_Exercicio01{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        float n1, n2, n3, n4 = 0;// Inicializando as variáveis

        //Lendo 4 números:
        System.out.print("Digite um número: ");
        n1 = leia.nextFloat();
        System.out.print("\nDigite outro número: ");
        n2 = leia.nextFloat();
        System.out.print("\nDigite mais um número: ");
        n3 = leia.nextFloat();
        System.out.print("\nDigite um último número: ");
        n4 = leia.nextFloat();
        System.out.print("A soma dos 4 números é "+(n1 + n2 + n3 + n4));// Somando os 4 números
    }
}
