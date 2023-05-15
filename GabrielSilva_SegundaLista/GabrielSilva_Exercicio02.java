/* Algorítmo que mostra o maior número
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio02{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1, n2, n3 = 0;
        System.out.print("\nDigite um número: ");
        n1 = leia.nextInt();
        System.out.println("\nDigite outro número: ");
        n2 = leia.nextInt();
        System.out.print("\nDigite mais um número: ");
        n3 = leia.nextInt();
        if(n1 > n2 && n1 > n3)
            System.out.print("\nO maior número é o "+n1);
        else if(n2 > n1 && n2 > n3)
            System.out.print("\nO maior número é o "+n2);
        else if(n3 > n1 && n3 > n2)
            System.out.print("\nO maior número é o "+n3);
        else
            System.out.print("Os três são iguais!");
    }
}