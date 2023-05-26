import javax.swing.*;

public class Main  {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // vai indicar qual Pane vai carregar
        calculadora.setContentPane(calculadora.panelMain);
        calculadora.setVisible(true);
        calculadora.setSize(300,500);

    }
}