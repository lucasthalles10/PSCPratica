/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java 
Faça um programa para o seguinte problema: Compraram-se N 
canetas iguais, que foram pagas com uma nota de Z reais, 
obtendo-se Y reais como troco. Quanto custou cada caneta? */
package Ex13;
import java.util.Scanner;
public class Ex17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de canetas compradas!");
        int can = sc.nextInt();
        System.out.println("Digite o valor em reais pago");
        double real =  sc.nextInt();
        System.out.println("Digite o valor do troco");
        double troco =  sc.nextInt();
        double resulf =(real - troco) / can;
        System.out.println("O valor de cada caneta é!" + resulf);
    }
   
}
