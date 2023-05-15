/* Algoritmo que calcula a média de 500 valores inseridos
   Gabriel Novais
   15/05/2023
 */

import java.util.Scanner;

public class GabrielSilva_Exercicio03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nota = 0, soma = 0;
        for(int cont = 1; cont <= 500; cont++){// Inciando o laço for para a contagem das notas
            // Recebendo as notas
            System.out.print("\nDigite uma nota: ");
            nota = input.nextInt();
            soma = soma + nota;// Adicionando valor a variável acumulatória
        }
        System.out.println("A média das notas é de "+(soma / 500));// Imprimindo a média
    }
}