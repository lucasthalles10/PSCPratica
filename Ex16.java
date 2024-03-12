/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java
Faça um programa que receba de entrada a distância total (em km) 
percorrida por um automóvel e a quantidade de combustível (em litros) 
consumida para percorrê-la, calcule e imprima o consumo médio de combustível. 
Fórmula: distância/litro.*/
package Ex13;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular a media do gasto de combustivel do seu veiculo!");
        System.out.println("Informe a distancia percorrida em Kilometros!");
        double km = sc.nextDouble();
        System.out.println("Informe a informe a quantidade de litros gasto no trajeto!");
        double lit = sc.nextDouble();
        if (km > 0 && lit > 0)
            {
                double res = km / lit;
                System.out.printf("O seu veiculoa faz em media: %.2f" ,res);
            }
        else
            {
                System.out.println("Numero negativo, ou invalido! Reinicie o programa");
            }
    }    
}