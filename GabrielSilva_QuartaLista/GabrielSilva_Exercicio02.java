/* algoritmo que soma enquanto for diferente de 48 e 71
   Gabriel Novais
   29/05/2023
*/

import java.util.Scanner;

public class GabrielSilva_Exercicio02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, soma = 0;
        
        for(int cont = 0; soma != 48 && soma != 71; cont++){// Laço que repete enquanto a soma for diferente de 48 ou 71
            System.out.print("\nDigite um número: ");
            n1 = input.nextInt();
            System.out.print("Digite outro número: ");
            n2 = input.nextInt();
            System.out.print("Digite mais um número: ");
            n3 = input.nextInt();
            soma = n1 + n2 + n3;// Somando as três notas
            System.out.println("O resultado da soma é "+soma);// Imprimindo o valor da soma
        }
    }
}