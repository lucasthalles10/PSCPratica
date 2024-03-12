/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java 
 Escrever um algoritmo que lê: - a porcentagem do IPI a 
ser acrescido no valor das peças - o código da peça 1, 
valor unitário da peça 1, quantidade de peças 1 - o código 
da peça 2, valor unitário da peça 2, quantidade de peças 2. 
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.*/
package Ex13;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da porcetagem do IPI! somente numeros!");
        double ipi = sc.nextDouble();
        System.out.println("Digite o código da primeira peça!");
        double cod1 = sc.nextDouble();
        System.out.println("Digite o valor da primeira peça!");
        double pe1 = sc.nextDouble();
        System.out.println("Digite a quantidade de peça solicitada!");
        double quan1 = sc.nextDouble();
         System.out.println("Digite o código da segunda peça!");
        double cod2 = sc.nextDouble();
        System.out.println("Digite o valor da segunda peça!");
        double pe2 = sc.nextDouble();
        System.out.println("Digite a quantidade de peça solicitada!");
        double quan2 = sc.nextDouble();
        double total = ((pe1*quan1) + (pe2*quan2))*((ipi/100)+1);
        System.out.printf("O valor total a ser pago é: %.2f",total);
    }
    
}
