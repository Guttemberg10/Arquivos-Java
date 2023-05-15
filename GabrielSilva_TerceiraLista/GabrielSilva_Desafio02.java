/* Algoritmo que mostra um número n n vezes
   Gabriel Novais
   15/05/2023
 */

import java.util.Scanner;

public class GabrielSilva_Desafio02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = 0;// Iniciando a variável de contagem
        while(n <= 1){// Forçando o usuário a digitar um número maior que 1

            // Lendo um valor do usuário:
            System.out.print("Digite um valor maior que 1: ");
            n = input.nextInt();
        }
        // Imprimindo o número n n vezes:
        for(int cont = n; cont > 0; cont--){
            System.out.println(n);
        }
    }
}