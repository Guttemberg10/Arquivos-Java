/* algoritmo que soma de 50 números inteiros e a soma de 50 decimais
   Gabriel Novais
   29/05/2023
*/

import java.util.Random;

public class GabrielSilva_Exercicio03{
    public static void main(String[] args){
        Random gerador = new Random();

        int soma1 = 0, cont = 0;
        double soma2 = 0;
        while(cont <= 50){// Gerando 50 números aleatórios e somando eles
            soma1 += (gerador.nextInt(5));// Aleatórios inteiros
            soma2 += (gerador.nextDouble());// Aleatórios decimais
            cont++;
        }

        // Imprimindo a soma:
        System.out.println("Soma dos inteiros: "+soma1);
        System.out.println("Soma dos decimais: "+soma2);
        
        // Verificando qual das duas variáveis é a maior:
        if(soma1 > soma2){
            System.out.println(soma1+" É a maior");
        }
        else if(soma2 > soma1){
            System.out.println(soma2+" É a maior");
        }else{
            System.out.println("São iguais");
        }
    }
}