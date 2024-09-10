//Crie um programa em Java que imprima o sexo de uma pessoa utilizando como valores de entrada M ou F.
//PABLO HENRIQUE
package exercicios1;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String nome;
        String sexo;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu sexo (F ou M): ");
        sexo = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);

    }
}
