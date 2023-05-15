/* Algorítmo que mostra o maior número
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio09{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2 = 0;
        System.out.print("Digite um número: ");
        n1 = input.nextInt();
        System.out.print("Digite outro número: ");
        n2 = input.nextInt();
        if(n1 > n2)
            System.out.print("\n"+n1+" é o maior");
        else if(n2 > n1)
            System.out.print("\n"+n2+" é o maior");
        else
            System.out.print("\nOs números são iguais");
    }
}