/* Algoritmo que mostra todos os números de 0 e 200
   Gabriel Novais
   15/05/2023
 */

public class GabrielSilva_Desafio01{
    public static void main(String[] args){
        int cont1 = 0;// Iniciando a variável de contagem
        for(int cont = 0; cont < 1000; cont++){// Iniciando o laço for
            if(cont1 == 10){
                System.out.println("O número "+cont+" é múltiplo de 10");
                cont1 = 0;
            }else{
                System.out.println(cont);
            }
            cont1++;
        }
    }
}