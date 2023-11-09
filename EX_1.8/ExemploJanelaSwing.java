import javax.swing.*;

public class ExemploJanelaSwing {
    public static void main(String[] args) {
        // Cria uma janela
        JFrame janela = new JFrame("Minha Janela Swing");
        
        // Define o tamanho da janela
        janela.setSize(400, 300);
        
        // Define o comportamento ao fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria um rótulo (label) para exibir texto
        JLabel rotulo = new JLabel("Olá, Mundo!");
        
        // Adiciona o rótulo à janela
        janela.add(rotulo);
        
        // Centraliza a janela na tela
        janela.setLocationRelativeTo(null);
        
        // Torna a janela visível
        janela.setVisible(true);
    }
}