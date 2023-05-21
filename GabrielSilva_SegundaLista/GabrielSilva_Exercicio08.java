
/* Algorítmo que "conversa" com o usuário
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio08{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Declarando as variáveis (uma de cada tipo):
        int idade = 0;
        double dinheiro = 0.0;
        char sexo = ' ';
        String nome = "";
       
        System.out.print("\nOlá, usuário, qual é seu nome? ");
        nome = input.nextLine();// Lendo o nome do usuário
        System.out.print("\nAh... Isso é nome de homem ou mulher? (m ou f) ");
        sexo = input.next().charAt(0);// Lendo o sexo do usuário (m ou f)
       
        if(sexo == 'm')// Verificando se é homem
            System.out.println("\nAh, sim, verdade. Meu tio também se chamava "+nome+"\nEle acabou saíndo do armário depois de um tempo");
        else if(sexo == 'f')// Verificando se for mulher
            System.out.println("\nAh, sim, verdade. Minha saudosa sogra também se chamava "+nome);
        else// Se não for homem nem mulher
            System.out.println("\nNão conheço este sexo... Diferente!");
       
        System.out.print("\nE quantos anos você tem, "+nome+"? ");
        idade = input.nextInt();// Lendo a idade
        System.out.println("\nDesculpe-me, esqueci de me apresentar. Sou Mário!\nAquele que concertou seu armário! Sou carpinteiro :)");
        System.out.print("\nEu posso te levar para jantar? Tenho 5 mil na conta. Você tem quantos reais? ");
        dinheiro = input.nextDouble();// Lendo valor da conta bancária
       
        if(dinheiro >= 500 && dinheiro <= 1500)
            System.out.println("\nEu pensei que teria mais, mas já é possível comprar uns pastéis.");
        else if(dinheiro < 500)
            System.out.println("\nPuxa, acabei de esquecer que deixei o cachorro na esmirilhadeira. Preciso ir, tchau!");
        else if(dinheiro > 1500){
           
            // Usando switch case para ver se é homem ou mulher (novamente):
            switch(sexo){
                case 'm':
                    System.out.println("\nNós podemos nos casar, não acha? Assim... É apenas uma idéia... Você é bonitão, sabe...");
                    System.out.println("\nA conversa está muito boa, mas preciso ir trabalhar\nTenho que ir atrás de armários por aí...");
                break;
                case 'f':
                    System.out.println("\nNós podemos nos casar, não acha? Você não faz muito bem o meu tipo, mas tudo bem");
                break;
                default:
                    System.out.println("\nVou te assaltar!\nBrincadeirinha hahaha Nunca faria isso!");
            }
            // "Despedindo-se" do usuário:
            System.out.println("\nA conversa está muito boa, mas preciso ir trabalhar\nTenho que ir atrás de armários por aí...");
        }
    }
}
