/* Algorítmo que mostra o maior número
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio02{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1, n2, n3 = 0;// Declarando 3 variáveis
       
        // Lendo três valores:
        System.out.print("\nDigite um número: ");
        n1 = leia.nextInt();
        System.out.println("\nDigite outro número: ");
        n2 = leia.nextInt();
        System.out.print("\nDigite mais um número: ");
        n3 = leia.nextInt();
        if(n1 > n2 && n1 > n3)// Verificando se n1 é o maior
            System.out.print("\nO maior número é o "+n1);
        else if(n2 > n1 && n2 > n3)// Verificando se n2 é o maior
            System.out.print("\nO maior número é o "+n2);
        else if(n3 > n1 && n3 > n2)
            System.out.print("\nO maior número é o "+n3);// Verificando se n3 é o maior
        else// Verificando se eles são iguais
            System.out.print("Os três são iguais!");
    }
}
