import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JTextField textPrimeiro;
    private JLabel PrimeiroNumero;
    private JLabel SegundoNumero;
    private JTextField textSegundo;
    private JButton buttonAdicao;
    private JButton buttonSubtracao;
    private JButton buttonDivide;
    private JButton buttonVezes;
    private JButton CEButton;
    private JTextField textResultado;
    public JPanel panelMain;

    public Calculadora() {
    buttonAdicao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Integer valor1 = Integer.valueOf( textPrimeiro.getText());
            Integer valor2 = Integer.valueOf( textSegundo.getText());

            Integer soma = valor1 + valor2;

            textResultado.setText(soma.toString());
        }
    });
    buttonSubtracao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Integer valor1 = Integer.valueOf( textPrimeiro.getText());
            Integer valor2 = Integer.valueOf( textSegundo.getText());

            Integer subtracao = valor1 - valor2;
            textResultado.setText(subtracao.toString());
        }
    });
    buttonDivide.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Integer valor1 = Integer.valueOf( textPrimeiro.getText());
            Integer valor2 = Integer.valueOf( textSegundo.getText());

            Double divisao = (double) (valor1 / valor2);
            textResultado.setText(divisao.toString());

        }

    });
    buttonVezes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Integer valor1 = Integer.valueOf( textPrimeiro.getText());
            Integer valor2 = Integer.valueOf( textSegundo.getText());

            Integer Multiplicacao = valor1 * valor2;
            textResultado.setText(Multiplicacao.toString());
        }
    });
    CEButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textResultado.setText("  ");
        }
    });
}
}
