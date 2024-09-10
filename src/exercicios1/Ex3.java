//Faça um programa em Java que leia 2 números e exiba qual deles é o maior ou então informe que são iguais
//BERNARDO
package exercicios1;
import java.util.Scanner;
public class Ex3 {
    public Ex3() {
    }

    public static void main(String[] arg) {
        Scanner nn = new Scanner(System.in);
        Scanner nd = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = nn.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = nd.nextInt();
        if (n1 > n2) {
            System.out.printf("O primeiro numero digitado é maior.");
        }

        if (n2 > n1) {
            System.out.printf("O segundo numero digitado é maior.");
        } else if (n1 == n2) {
            System.out.printf("Os numeros são iguais.");
        }

    }
}
