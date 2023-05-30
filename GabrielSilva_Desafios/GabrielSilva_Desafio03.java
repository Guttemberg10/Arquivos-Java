/* Algoritmo que verifica se a senha está correta
   Gabriel Novais
   30/05/2023
 */

import java.util.Scanner;

public class GabrielSilva_Desafio03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String senha = "";
        
        while(senha.equals("JumiraldsMeuXuxu") == false){// Repetindo enquanto a senha for errada
            System.out.print("\nDigite a senha: ");
            senha = input.nextLine();// Lendo a senha do usuário

            if(senha.equals("JumiraldsMeuXuxu") == false)// Se a senha for errada
                System.out.println("tente novamente");
        }
        
        System.out.println("Senha correta");// Se a senha for certa
    }
}