package exercicios2;
import javax.swing.JOptionPane;
public class Ex2 {
    public static void main(String[] arg){
        String n1 = JOptionPane.showInputDialog(null, "Digite um número inteiro: ");
        String n2 = JOptionPane.showInputDialog(null, "Digite outro número inteiro: ");

        if(n1 == null && n2 == null){
            System.exit(0);
        }

        if(n1.isEmpty() && n2.isEmpty()){
            JOptionPane.showMessageDialog(null, "ERRO: As entradas não podem estar vazias.");
            System.exit(0);
        }
        try{
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            float media = (num1+num2)/2F;
            String resultado = String.format("A média dos números %d e %d é: %.2f", num1, num2, media);
            JOptionPane.showMessageDialog(null, resultado);

        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO! Digite apenas números inteiros.");
        }


    }

}