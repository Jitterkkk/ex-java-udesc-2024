//Programe um aplicativo em Java que leia um nome e uma idade. Se a idade for menor que 16, deve exibir o
//nome juntamente com a mensagem “Não pode votar!”, caso contrário, deve exibir o nome com a mensagem
//“Apto a votar!”.
//BERNARDO
package exercicios1;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String nome;
        String cpf;
        int idade;

        System.out.println("Digite seu nome completo: ");
        nome = sc.nextLine();
        System.out.println("Informe seu CPF: ");
        cpf = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        if(idade<16){
            System.out.printf("%s, inscrito sob CPF N° %s, não está apto a votar!", nome, cpf);
        }
        else{
            System.out.printf("%s, inscrito sob CPF N° %s, está apto a votar!", nome, cpf);
        }
    }
}
