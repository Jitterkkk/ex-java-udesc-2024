
//Faça um programa em Java que leia um número inteiro e exiba tanto seu sucessor quanto seu antecessor
//BERNARDO
package exercicios1;
import java.util.Scanner;
public class Ex1 {
    public Ex1() {
}

    public static void main(String[] arg) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;
        System.out.printf("O sucessor do numero %d e %d e o antecessor e %d. ", numero, sucessor, antecessor);
    }
}


