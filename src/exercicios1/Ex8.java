//Faça um metodo que leia 4 valores inteiros e exiba o maior e o menor deles
//PABLO HENRIQUE
package exercicios1;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int n3 = sc.nextInt();
        System.out.println("Digite o quarto numero: ");
        int n4 = sc.nextInt();
        int maior = n1;
        int menor = n1;

        if(n2>maior){
        maior = n2;
    }
        if (n2<menor){
        menor = n2;
    }
        if(n3>maior){
            maior = n3;
        }
        if (n3<menor){
            menor = n3;
        }
        if(n4>maior){
            maior = n4;
        }
        if (n4<menor){
            menor = n4;
        }
        System.out.printf("O maior valor é : %d\n", maior);
        System.out.printf("O menor valor é : %d", menor);

}
}
