import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");
        Calc c = new Calc();

        try {
            c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro número:"));
            c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o segundo número:"));

            JOptionPane.showMessageDialog(null, "Soma : " + dc.format(c.somar()));
            JOptionPane.showMessageDialog(null, "Subtração : " + dc.format(c.diminuir()));
            JOptionPane.showMessageDialog(null, "Multiplicação : " + dc.format(c.multiplicar()));
            JOptionPane.showMessageDialog(null, "Divisão : " + dc.format(c.dividir()));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Valor inválido. Por favor, insira um número válido.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero.");
        } catch (NumeroNegativo e) {
            JOptionPane.showMessageDialog(null, "Erro: Número negativo inserido.");
        }
    }
}
