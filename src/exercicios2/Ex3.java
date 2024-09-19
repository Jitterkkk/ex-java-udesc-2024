package exercicios2;
import java.util.Scanner;
public class Ex3 {
    public static final int bitsporbyte = 8;
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        long nBits = 0;
        System.out.println("Digite o número de bits: ");
        if(sc.hasNextLong()){
            nBits = sc.nextLong();

            if(nBits>0 && nBits<Long.MAX_VALUE){
                if(nBits % bitsporbyte ==0){
                    long nBytes = nBits/bitsporbyte;
                    System.out.printf(nBits+" bits correspondem a " + nBytes+ " bytes!");
                }
                else{
                    System.out.printf("ERRO: O número de bites precisa ser múltiplo de 8!");
                }
            }
            else {
                System.out.printf("ERRO: O número de bits deve ser positivo e menor ou igual a " + Long.MAX_VALUE +"!");
            }
        }
        else{
            System.out.printf("ERRO: Digite um número do tipo LONG!");
        }
    }
}