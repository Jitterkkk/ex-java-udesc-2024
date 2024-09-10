//Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo em Java que pergunte a idade de
//uma pessoa e diga se ela pode doar sangue ou não.
//PABLO HENRIQUE
package exercicios1;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if(idade<18 || idade>67){
            System.out.printf("Olá %s, infelizmente você não está apto a doar sangue!", nome);
        }
        else{
            System.out.printf("Olá %s, você pode doar sangue, procure o banco de doação mais próximo e ajude salvar vidas!", nome);
        }
    }
}

