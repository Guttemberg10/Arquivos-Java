/* Algoritmo que determina o maior número entre vários
   Gabriel Novais
   30/05/2023
 */

import java.util.Scanner;

public class GabrielSilva_Desafio01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 1, maior = 0;

        System.out.println("Digite 0 para parar o programa.");
        while(n != 0){// Repetindo enquanto for diferente de zero
            System.out.print("\nDigite um número: ");
            n = input.nextInt();
            if(n > maior){// Verificando o número maior
                maior = n;// Armazenando o maior número na variável
            }
        }
        System.out.println("O maior número digitado foi "+maior);// Imprimindo o maior
    }
}
