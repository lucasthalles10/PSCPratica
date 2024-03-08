package Ex01;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        int num1, num2, soma; // declaração de variaveis 
        Scanner input = new Scanner(System.in); // objeto para ler 
        System.out.println("Soma de dois numeros!"); // mostra na tela oque precisa ser digitado
        System.out.println("Digite um numero:");
        num1 = input.nextInt(); //Ler oque é digitado no teclado funciona da mesma forma para float/double, char fica somente "next"
        System.out.println("Digite o segundo numero:");
        num2 = input.nextInt();
        soma = num1 + num2; //Soma de duas variaveis
        System.out.println("Sua soma de:" + soma); // mostra somente um resultado
        System.out.println("Sua soma de:" + num1 +" e "+num2+" é "+soma); // concatenação de resultado ]
        System.out.printf("A soma de %d + %d = %d. ",num1,num2,soma); //%d para inteiro / %f para float e double /%s string /%b boolean
        
                
        
    }
}
