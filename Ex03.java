/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex03;
import java.util.Scanner;
public class Ex03 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // objeto para ler a string
        String nome; // declaração de variavel
        System.out.println("Por favor, insira seu primeiro nome:");
        nome = input.nextLine(); //Ler oque é digitado no teclado funciona da mesma forma para float/double, char fica somente "next"
        System.out.println("Olá, " + nome + "! Tenha uma excelente dia!"); // Escreve na tela uma saudação para o usuário        
    }   
}

/*Anotações
Variaveis Utilizadas:
String: nome
*/ 