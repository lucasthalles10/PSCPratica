/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex11;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.println("Calculo da media de suas 3 notas!");
        System.out.println("Digite a primeira nota:");
        double n1 = nt.nextDouble();
        System.out.println("Digite a segunda nota:");
        double n2 = nt.nextDouble();
        System.out.println("Digite a terceira nota:");
        double n3 = nt.nextDouble();
        double resultado = (n1+n2+n3)/3;
        System.out.printf("A media das suas notas é: %,2f",resultado);
    }
}
