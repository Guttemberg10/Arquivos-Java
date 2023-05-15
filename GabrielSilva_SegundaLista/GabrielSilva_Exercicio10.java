/* Algorítmo que mostra se um número é par ou impar
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        System.out.print("Digite um número: ");
        n1 = input.nextInt();
        if(n1 % 2 == 0)
            System.out.print("\n"+n1+" é par");
        else
            System.out.print("\n"+n1+" é impar");
    }
}