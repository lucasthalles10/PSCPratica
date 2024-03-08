/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex10;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Vamos converter Fahrenheit para Celsius!");
        double fah = temp.nextDouble();
        double resultado = (fah - 32) * 5/9;
        System.out.printf("O resultado é: %.2f C",resultado);
    }
}
