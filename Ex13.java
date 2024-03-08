/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex13;
import java.util.Scanner;
public class Ex13 {

    public static void main(String[] args) 
    {
        double salario,resultado;
        double salario1=1412.00;
        double salario2=2666.68;
        double salario3=4000.03;
        double salario4=7786.02;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular o valor liquido do seu salario!");
        System.out.println("Digite por gentileza a quantidade de horas trabalhadas!");
        double sal = sc.nextDouble();
        System.out.println("Digite por gentileza o valor da sua hora trabalhada!");
        double sal1 = sc.nextDouble();
        salario = sal * sal1;
        if (salario <= salario1)
        {
            resultado = salario - (salario * 0.075);
            System.out.println("O seu salario liquido é " +resultado+". Valor descontado do INSS é de 7,5%" );
        }
        else if (salario > salario1 && salario <= salario2)
        {
            resultado = salario - (salario * 0.09);
            System.out.println("O seu salario liquido é " +resultado+". Valor descontado do INSS é de 9%" );
        }
        else if (salario > salario2 && salario <= salario3)
        {
            resultado = salario - (salario * 0.12);
            System.out.println("O seu salario liquido é " +resultado+". Valor descontado do INSS é de 12%" );
        }
        else if (salario > salario3 && salario <= salario4)
        {
            resultado = salario - (salario * 0.14);
            System.out.println("O seu salario liquido é " +resultado+". Valor descontado do INSS é de 14%" );
        }
        else 
        {
            resultado = salario - (salario * 0.14);
            System.out.printf("O seu salario liquido é " +resultado+". Valor descontado do INSS é de 14%" );
        }
    }
}
