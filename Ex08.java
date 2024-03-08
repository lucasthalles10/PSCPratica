/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex08;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) 
    {
        double cm = 100;
        Scanner medir = new Scanner(System.in);
        System.out.println("Vamos converter a medida de metros para centimetros!");
        System.out.println("Digite a quantidade de metros a ser convertida!");
        double metros = medir.nextDouble();
        double resul = metros * cm;
        System.out.println("O resultado é!"+resul+ " centimetros");
        
    }
    
}
