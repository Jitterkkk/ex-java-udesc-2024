package exercicios2;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Digite um número inteiro: ");
        n1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        n2 = sc.nextInt();
        float media = (n1+n2)/2F;
        System.out.printf("A média dos números %d e %d é: %.2f", n1, n2, media);

    }
}