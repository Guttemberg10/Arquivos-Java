/* Algorítmo que calcula a cotação do dólar
   Gabriel Novais
   05/05/2023
 */
import java.util.Scanner;

public class ex3{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double dolar = 4.95, real = 0;// Inicializando variáveis
        System.out.print("Digite um valor em real: ");
        real = leia.nextDouble();// Lendo uma quantia monetária em real
        System.out.print("\nO valor em dólar é de US$"+(real / dolar));// Imprimindo e calculando a conversão
    }
}
