//Desenvolva um programa em Java que calcule a quantidade de dinheiro gasta por um fumante. O usuário deverá
//fornecer o número de anos que ele fuma, o número de cigarros fumados por dia e o preço de uma carteira.
//Considere que existem 20 cigarros em uma carteira
//PABLO HENRIQUE
package exercicios1;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int anos;
        int cigarros;
        float carteira;
        float preco;
        System.out.println("Você fuma a quantos anos? ");
        anos = sc.nextInt();
        System.out.println("Quantos cigarros você fuma por dia?");
        cigarros = sc.nextInt();
        System.out.println("Quanto você paga por carteira?");
        preco = sc.nextFloat();
        carteira = (float)(cigarros /20);
        float d1= (preco*carteira);
        int dias= anos*365;
        float d2 = d1*dias;
        System.out.printf("Como você fuma %d cigarros por dia, você precisa comprar %.0f carteiras por dia\n", cigarros, carteira);
        System.out.printf("Considerando o valor informado de R$%.2f, são R$%.2f por dia.\n", preco, d1);
        System.out.printf("Então, se você fuma a %d anos, são %d dias.\n", anos, dias);
        System.out.printf("Isso totaliza R$%.2f! PARE DE FUMAR!\n", d2);
        sc.close();
    }}


