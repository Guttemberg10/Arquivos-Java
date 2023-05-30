/* Algoritmo que controla um estoque
   Gabriel Novais
   30/05/2023
 */

import java.util.Scanner;

public class GabrielSilva_Desafio04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String opcao = "";
        
        // Laço que repete para não deixar o usuário digitar algo sem sentido:
        while(opcao.equals("X") == false && opcao.equals("A") == false && opcao.equals("B") == false && opcao.equals("C") == false){// Repetindo enquanto a senha for errada
            System.out.println("Digite:");
            System.out.println("X - Para fechar o programa.");
            System.out.println("A - Para adicionar uma unidade em estoque.");
            System.out.println("B - Para subtrair uma unidade em estoque .");
            System.out.println("C - para Mostrar o total em estoque.");
            opcao = input.nextLine();// Lendo a opção do usuário
        }
    }
}