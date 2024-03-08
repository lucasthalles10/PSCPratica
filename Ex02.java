/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex02;
    import java.util.Scanner;
public class Ex02 
{   
    public static void main(String[] args) 
    {
        double x,y,div; // declaração de variaveis 
        Scanner input = new Scanner(System.in); // objeto para ler 
        System.out.println("Divisão de dois numeros!"); // mostra na tela oque precisa ser digitado
        System.out.println("Digite um numero:");
        x = input.nextDouble(); //Ler oque é digitado no teclado funciona da mesma forma para float/double, char fica somente "next"
        System.out.println("Digite o segundo numero:");
        y = input.nextDouble();
        div = x % y; // Resto da divisão de duas variaveis
        System.out.printf("A divisão de %.2f + %.2f = %.2f",x,y,div);  // formatação de 2 casas decimais 
    }
}
/*Anotações
Variaveis Utilizadas:
double: x,y,div
*/ 