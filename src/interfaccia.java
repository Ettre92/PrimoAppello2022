import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaccia {
    private JPanel pannello;
    private JButton bottoneButton;

    public interfaccia() {


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("interfaccia");
        frame.setContentPane(new interfaccia().pannello);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
