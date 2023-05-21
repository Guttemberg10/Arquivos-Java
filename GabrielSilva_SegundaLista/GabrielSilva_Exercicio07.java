/* Algorítmo que testa um número
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio07{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int x = 0;
       
        System.out.print("Digite um número: ");
        x = leia.nextInt();
        if(x > 94 && x < 456)// Verificando o número digitado pelo usuário
            System.out.print("Acertou");// Imprimindo se acertou
        else
            System.out.print("Tente de novo");// Imprimindo se errou
    }
}
