/* Algorítmo que mostra o sucessor e o antecessor de um número
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio05{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n = 0;
        System.out.print("Digite um número: ");
        n = leia.nextInt();
        System.out.println("Antecessor: "+(n - 1)+"\nSucessor: "+(n + 1));
    }
}