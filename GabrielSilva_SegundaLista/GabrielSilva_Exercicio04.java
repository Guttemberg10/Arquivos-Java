/* Algorítmo que inverte o valor de variáveis
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio04{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int a, b, c = 0;// Declarando as variáveis
       
        System.out.print("Digite um número: ");
        a = leia.nextInt();
        System.out.print("\nDigite mais um número: ");
        b = leia.nextInt();
        System.out.print("\n A valia: "+a+"\nB valia: "+b);// Imprimindo os valores digitados
        c = a; a = b; b = c;// Invertendo o valor de "a" e de "b"
        System.out.println("\n A vale: "+a+"\nB vale: "+b);// Imprimindo os valores alterados
    }
}
