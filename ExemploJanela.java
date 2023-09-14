import javax.swing.*;
import java.awt.*;

        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JPanel;
        import javax.swing.JTextField;


public class ExemploJanela extends JFrame {

    //Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonLimpar = new JButton("Limpar");
    private JTextField jTextFieldTexto = new JTextField("Teste", 20);
    private JLabel jLabelMensagem = new JLabel("Exemplo Simples de Janela");



    //Construtor

    public ExemploJanela () {
        this.setTitle("Texto da Bara de Titulo");
        this.setSize(300, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
        painel.setBackground(new Color(255, 255, 255));
        painel.add(jTextFieldTexto);
        painel.add(jButtonLimpar);
        painel.add(jLabelMensagem);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);// centralizar janela
        this.setVisible(true); // Exibir Janela
    }

    public static void main (String[] args){
        new ExemploJanela();
    }



}