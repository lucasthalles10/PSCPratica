/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex09;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) 
    {
        Scanner circ = new Scanner(System.in); // (A = π r²).
        System.out.println("Vamos calcular a area de um circulo!");
        System.out.println("Digite o calor do raio:");
        double raio = circ.nextFloat();
        double area = Math.PI * (raio *raio);
        System.out.printf("O valor da Area é: %.3f",area);
    }
    
}
