import javax.swing.*;

public class Victory extends JFrame {
    private JPanel pnlPanello;
    private JButton faiUnAltraPartitaButton;
    private JLabel lblCongratulation;

    Victory(String name){
        setContentPane(pnlPanello);
        setTitle("CONGRALUTAZIONI");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        lblCongratulation.setText("COMPLIMENTI "+name+" HAI VINTO");
        }
}
