/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
Desenvolva um programa que, dados dois valores A e B, troque os valores de 
forma que A passe a ter o valor de B e vice-versa. Exiba os valores após a troca.*/
package Ex13;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esse programa trocara os valores das Variaveis, A e B");
        System.out.println("Informe um numero para variavel A!");
        double num1 = sc.nextInt();
        System.out.println("Informe um numero para variavel B!");
        double num2 = sc.nextInt();
        System.out.printf("O valor da variavel A é %.2f. \nO valor da variavel B é %.2f",num2,num1);
    }    

            
    
}
