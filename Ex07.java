/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex07;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) 
    {
        Scanner salario = new Scanner(System.in);
        System.out.println("Vamos reajustar seu salario em 7%:");
        System.out.println("Digite o valor do salario!");
        double sal = salario.nextDouble();
        double resultado = sal * 1.07;
        System.out.println("O valor com 7% de acrecimo é:"+resultado);
    }
    
}
