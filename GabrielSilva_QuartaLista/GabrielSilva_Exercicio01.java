/* algoritmo que soma os quadrados divisiveis por 4
   Gabriel Novais
   29/05/2023
*/

import java.util.Scanner;

public class GabrielSilva_Exercicio01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int soma = 0, leia = 0;

        for(int cont = 0; cont <= 500;cont++){// Repetindo 500x
            System.out.print("Digite um número: ");
            leia = input.nextInt();// lendo um número do usuário
            if(Math.pow(leia, 2) % 4 == 0){// Verificando se o quadrado é divisivel por 4
                soma += Math.pow(leia, 2);// Somando o número
            }
        }
        // Imprimindo a soma dos quadrados que são divisiveis por 4:
        System.out.println("A soma dos números que o quadrado é divisível por 4 é "+soma);
    }
}
