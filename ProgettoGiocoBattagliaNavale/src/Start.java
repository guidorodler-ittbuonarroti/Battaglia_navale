import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Start extends JFrame {
    private JPanel pnlPannello;
    private JTextField textField2;
    private JLabel lblTitolo;
    private JButton button1;
    private JTextField textField3;
    private JLabel NomeGiocatore1;
    private JLabel NomeGiocatore2;

    Start(){
        setContentPane(pnlPannello);
        setTitle("Welcome");
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        Start gioco = new Start();
    }
}






