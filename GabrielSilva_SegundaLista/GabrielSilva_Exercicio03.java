/* Algorítmo que calcula a área de um triângulo
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio03{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double b, h = 0.0;
       
        System.out.print("Digite a base do triângulo: ");
        b = leia.nextDouble();// Lendo a base do triângulo
        System.out.print("\nDigite a altura do triângulo: ");
        h = leia.nextDouble();// Lendo a algura do triângulo
        System.out.print("\nA área do triângulo é "+((b * h) / 2));// Imprimindo e calculando a área
    }
}
