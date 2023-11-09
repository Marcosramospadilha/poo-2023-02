import javax.swing.*;
import java.awt.event.*;

public class TipoTrianguloGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Verificar Triângulo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel labelLado1 = new JLabel("Lado 1:");
        labelLado1.setBounds(20, 20, 80, 25);
        panel.add(labelLado1);

        JTextField textLado1 = new JTextField(10);
        textLado1.setBounds(100, 20, 165, 25);
        panel.add(textLado1);

        JLabel labelLado2 = new JLabel("Lado 2:");
        labelLado2.setBounds(20, 50, 80, 25);
        panel.add(labelLado2);

        JTextField textLado2 = new JTextField(10);
        textLado2.setBounds(100, 50, 165, 25);
        panel.add(textLado2);

        JLabel labelLado3 = new JLabel("Lado 3:");
        labelLado3.setBounds(20, 80, 80, 25);
        panel.add(labelLado3);

        JTextField textLado3 = new JTextField(10);
        textLado3.setBounds(100, 80, 165, 25);
        panel.add(textLado3);

        JButton verificarButton = new JButton("Verificar");
        verificarButton.setBounds(100, 120, 100, 25);
        panel.add(verificarButton);

        JLabel resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(20, 150, 250, 25);
        panel.add(resultadoLabel);

        verificarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado1 = Double.parseDouble(textLado1.getText());
                    double lado2 = Double.parseDouble(textLado2.getText());
                    double lado3 = Double.parseDouble(textLado3.getText());

                    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
                        resultadoLabel.setText("Insira valores válidos maiores que zero.");
                    } else if (lado1 == lado2 && lado2 == lado3) {
                        resultadoLabel.setText("Triângulo Equilátero");
                    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                        resultadoLabel.setText("Triângulo Isósceles");
                    } else {
                        resultadoLabel.setText("Triângulo Escaleno");
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}