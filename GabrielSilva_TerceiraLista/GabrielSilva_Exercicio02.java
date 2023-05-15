/* Algoritmo que lê dois valores mostra todos os números entre eles
   Gabriel Novais
   15/05/2023
 */

import java.util.Scanner;

public class GabrielSilva_Exercicio02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        // Lendo dois valores:
        System.out.print("Digite um número: ");
        n1 = input.nextInt();
        System.out.print("\nDigite outro número maior: ");
        n2 = input.nextInt();
        for(int cont = n1; cont < n2; cont++){// Iniciando o laço for
            System.out.println(cont);// Imprimindo os números
        }
    }
}