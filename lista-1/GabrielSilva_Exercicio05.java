/* Algorítmo que calcula sua faixa etária
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class ex5{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int idade = 0;// Incializando a variável
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();// Lendo a idade do usuário
        if(idade > 0 && idade < 12)// Verificando se é uma criança
            System.out.print("Você ainda é uma criança. Que fofo!");
        else if(idade >= 12 && idade < 19)// Verificando se é adolescente
            System.out.print("Você é um adolescente. Massa, massa...");
        else if(idade >= 19 && idade < 65)// verificando se é adulto
            System.out.print("Trabalha feito um jumento, né, adulto?");
        else if(idade >= 65)// Verificando se é um idoso
            System.out.print("Aproveite seus ultimos dias, veio... HAHAHAHA");
        else// Identificador de fraude
            System.out.print("Você já nasceu?");
    }
}
