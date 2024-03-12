/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
Construa um programa que calcule as raízes de uma equação de 2º 
grau (Ax2+Bx+C). Sendo que os valores A,B e C são fornecidos pelo 
usuário. Considere que tem duas raízes.
*/
package Ex13;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular as raizes de uma equação de 2° grau (Ax2+Bx+C)");
        System.out.println("Digite o valor de A!");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de B!");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de C!");
        double c = sc.nextDouble();
        // bhaskara x= b²-4.a.c / x = (-b ± √Δ) / (2a)
        double delta = (b*b)-4*(a*c);
        if (a != 0 && a < 0)
        {
        double x1= (((b * (-1))- (Math.sqrt(delta))))/(2*a);  
        double x2= (((b * (-1))+ (Math.sqrt(delta))))/(2*a);  
            System.out.println(x1);
            System.out.println(x2);
        }
        else
        {
            System.out.println("O valor de A não pode ser 0 ou negativo, inicie o programa novamente");
        }
            
    }
    
}