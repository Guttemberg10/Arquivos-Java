/* algoritmo que verifica se você digitou uma palavra grande ou não
   Gabriel Novais
   29/05/2023
*/

import java.util.Scanner;

public class GabrielSilva_Exercicio04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String palavra = "";

        System.out.print("Digite uma palavra: ");
        palavra = input.nextLine();
        if(palavra.length() > 10){
            System.out.println("Você digitou um palavrão!");
        }else{
            System.out.println("Você digitou uma palavrinha");
        }
    }
}