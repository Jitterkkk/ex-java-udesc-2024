//Escreva um programa em Java que pergunte quanto o funcionário ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
//BERNARDO
package exercicios1;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] srg){
        Scanner sc = new Scanner(System.in);
        int horas;
        double ganhaphora;
        double salario;
        System.out.println("Quantas horas você trabalha por mês?");
        horas = sc.nextInt();
        System.out.println("Quanto você ganha por hora?");
        ganhaphora = sc.nextDouble();
        salario = horas*ganhaphora;
        System.out.printf("Seu salário mensal é de R$ %.2f\n", salario);
    }
}
