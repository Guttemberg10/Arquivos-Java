/* algoritmo que imprime os números de 10 a 0
   Gabriel Novais
   29/05/2023
*/

import java.util.Scanner;

public class GabrielSilva_Exercicio06{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 0, soma = 0;

        for(int cont = 0; cont <= 10; cont++){// Lendo 10 números positivos
            System.out.print("Digite um número: ");
            n = input.nextInt();
            if(n < 0){// Verificando se é um número negativo
                cont--;
            }else{
                soma += n;// Efetuando a soma
            }
        }
        System.out.println("Raiz quadrada de "+soma+" é: "+Math.sqrt(soma));// Imprimindo a raiz da soma dos 10 números
    }
}