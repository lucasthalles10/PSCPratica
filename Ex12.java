/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex12;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) 
    {
        double n1,n2,n3,n4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos mostrar o antecessor e o sucessor do numero digitado");
        System.out.println("Digite um numero:");
        double num = sc.nextDouble();
        if ( num % 1 == 0 ){
            n1 = num - 1;
            n2 = num + 1;
            System.out.printf("O seu valor antecessor %.1f ,atual %.1f e sucessor %.1f ",n1,num,n2);
        }else {
            n3 = num - 0.1;
            n4 = num + 0.1;
            System.out.printf("O seu valor antecessor %.1f ,atual %.1f e sucessor %.1f ",n3,num,n4);
        }
        
    }
}
