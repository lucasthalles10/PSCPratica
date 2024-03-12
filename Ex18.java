/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java 
 Cada degrau de uma escada tem X de altura. Faça um programa 
que receba essa altura e a altura que o usuário deseja alcançar 
subindo a escada, calcule e mostre quantos degraus ele deverá subir 
para atingir seu objetivo, sem se preocupar com a altura do usuário. 
Todas as medidas fornecidas devem estar em metros.*/
package Ex13;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual altura que o usuário deseja alcançar subindo a escada?");
        System.out.println("Digite a altura do degral em metros!");
        double de = sc.nextDouble();
        System.out.println("Digite a altura que você deseja alcançar, em metros!");
        double al = sc.nextDouble();
        double resul = al / de;
        System.out.printf("Voce]ê devera subir %.1f degraus!",resul);
    }
}
