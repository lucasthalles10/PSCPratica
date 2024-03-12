/* UC: PSC                  Data: 04/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java 
 Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:

Número                       Quadrado                       Cubo

0                                 0                                      0

1                                 1                                      1

*/
package Ex13;
public class Ex19 {
    public static void main(String[] args) 
    {
        System.out.println("{Número       Quadrado      Cubo}");
        for (int num = 0; num <= 10; num++)
        {
            int qua = num*num;
            int cubo = num*num*num;
            System.out.printf("{%d           %d               %d}\n",num,qua,cubo);
        }
    }
    
}
