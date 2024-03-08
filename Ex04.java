/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
*/
package Ex04;
import java.util.Scanner;       
public class Ex04 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, insira seu nome:");
        String nome = input.nextLine();
        System.out.println("Por favor, insira seu endereço:");
        String end = input.nextLine();
        System.out.println("Por favor, insira seu numero telefone:");
        long tel = input.nextLong();
        System.out.println("Olá, " + nome + "! \nVocê mora na, " + end + "\nE seu numero é:" +tel);  
    }
}
/*
Anotações
Variaveis Utilizadas:
String: nome,end
Int: tel
*/ 