/* Algorítmo que calcula sua faixa etária
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class ex6{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double r = 0;// Inicializando a variável do raio
        System.out.print("Digite o raio de um círculo: ");
        r = leia.nextDouble();// Lendo o valor do raio
        System.out.print("\nO perímetro da circunterência é "+(2 * 3.14 * r));// Imprimindo e calculando o perímetro
    }
}
