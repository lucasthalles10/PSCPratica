/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex05;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) 
    {
        double dolar = 4.95;
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos converter seu dolar em teal!");
        System.out.println("Digite a quantidade que deseja para conversão de dolar:");
        double real = input.nextDouble(); 
        double total = real * dolar;
        System.out.printf("O valor convertido é de: %.2f\nCotação atual do dolar: %.2f" ,total,dolar);
    }
    
}
