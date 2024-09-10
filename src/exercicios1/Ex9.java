//Faça um programa em Java que leia o nome e 3 notas de um aluno. Se obtiver média maior ou igual a 7 exibir
//a mensagem de aprovado, se ficar ≥ 5 e < 7, exibir a mensagem em exame, e se for abaixo disso, exibir
//reprovado. Lembrando que terá que exibir o nome do aluno também.
//BERNARDO
package exercicios1;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String nome;
        float n1;
        float n2;
        float n3;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua primeira nota: ");
        n1 = sc.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        n2 = sc.nextFloat();
        System.out.println("Digite sua terceira nota: ");
        n3 = sc.nextFloat();
        float media =(n1+n2+n3)/3;
        if (media>6.9){
            System.out.printf("Parabéns %s, você foi aprovado com a média %.2f! ", nome, media);
        }
        else if(media<7 && media>4.9){
            float falta = 7-media;
            System.out.printf("Atenção %s, você está de recuperação! Sua média é de %.2f, você precisa de %.2f para ser aprovado!", nome, media, falta);
        }
        else{
            System.out.printf("Olá %s, infelizmente você foi reprovado, sua média ficou em %.2f.", nome, media);
        }
    }
}
