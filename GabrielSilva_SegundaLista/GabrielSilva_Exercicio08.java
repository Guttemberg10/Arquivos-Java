
/* Algorítmo que "conversa" com o usuário
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class GabrielSilva_Exercicio08{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade = 0;
        double dinheiro = 0.0;
        char sexo = ' ';
        String nome = "";
        System.out.print("\nOlá, usuário, qual é seu nome? ");
        nome = input.nextLine();
        System.out.print("\nAh... Isso é nome de homem ou mulher? (m ou f) ");
        sexo = input.next().charAt(0);
        if(sexo == 'm')
            System.out.println("\nAh, sim, verdade. Meu tio também se chamava "+nome+"\nEle acabou saíndo do armário depois de um tempo");
        else if(sexo == 'f')
            System.out.println("\nAh, sim, verdade. Minha saudosa sogra também se chamava "+nome);
        else
            System.out.println("\nNão conheço este sexo... Deve ser um dos novos");
        System.out.print("\nE quantos anos você tem, "+nome+"? ");
        idade = input.nextInt();
        System.out.println("\nDesculpe-me, esqueci de me apresentar. Sou Mário!\nAquele que concertou seu armário! Sou carpinteiro :)");
        System.out.print("\nEu posso te levar para jantar? Tenho 5 mil na conta. Você tem quantos reais? ");
        dinheiro = input.nextDouble();
        if(dinheiro >= 500 && dinheiro <= 1500)
            System.out.println("\nEu pensei que teria mais, mas já é possível comprar uns pastéis.");
        else if(dinheiro < 500)
            System.out.println("\nPuxa, acabei de esquecer que deixei o cachorro na esmirilhadeira. Preciso ir, tchau!");
        else if(dinheiro > 1500){
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
            System.out.println("\nA conversa está muito boa, mas preciso ir trabalhar\nTenho que ir atrás de armários por aí...");
        }
    }
}