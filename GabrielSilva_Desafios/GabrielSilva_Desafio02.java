/* Algoritmo que determina o maior número entre vários
   Gabriel Novais
   30/05/2023
 */

import java.util.Scanner;

public class GabrielSilva_Desafio02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double media = 0.0, nota1 = 0.1, nota2 = 0.0;
        int pass = 0, rep = 0;


        System.out.println("Digite 20 para parar de digitar e ver a média.");
        for(int cont = 1; nota1 != 20; cont++){
            System.out.print("Digite duas notas do "+cont+"º aluno: ");
            
            // Lendo duas notas:
            nota1 = input.nextInt();
            if(nota1 == 20)
                break;// parando o laço se for 20
            nota2 = input.nextInt();
            media = (nota1 + nota2)/2;// Fazendo a média de um aluno
            if (media >= 5){
                pass++;// Adicionando um aluno no número de aprovados
            }
            if (media < 5){
                rep++;// Adicionando um aluno no número de reprovados
            }
        }
        System.out.println("Aprovados: "+pass+"\nReprovados: "+rep);// Imprimindo os aprovados e reprovados
    }
}