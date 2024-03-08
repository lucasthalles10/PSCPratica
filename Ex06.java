/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex06;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) 
    {
        int ano = 365;
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos calcular quantos dias de vida você tem!");
        System.out.println("Digite qual a sua idade:");
        int idade = input.nextInt(); 
        int total = ano * idade;
        System.out.printf("Você tem %d dias de vida, e %d anos de idade!" ,total,idade);
    }
    
}