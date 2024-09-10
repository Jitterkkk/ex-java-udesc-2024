//Escreva um programa em Java que leia uma distância inteira percorrida (em quilômetros), bem como o total
//de combustível gasto (em litros) e informe a média de consumo do veículo por km.
//PABLO HENRIQUE
package exercicios1;
import java.util.Scanner;
public class Ex2 {
    public Ex2() {
    }

    public static void main(String[] arg) {
        Scanner dist = new Scanner(System.in);
        Scanner gas = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida: ");
        float distancia = dist.nextFloat();
        System.out.println("Digite o total de gasolina gasto: ");
        float gasolina = gas.nextFloat();
        double media = (double)(distancia / gasolina);
        System.out.printf("A media de consumo foi de : %.2f", media);
    }
}
