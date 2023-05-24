import javax.sql.rowset.serial.SerialArray;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertionManager extends JFrame {
    private JPanel pnlManager;
    private JButton btnNext;
    private JLabel lblMessage;

    InsertionManager(){
        setContentPane(pnlManager);
        setTitle("Procedi");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.giuoco.SwitchPlayer();
                System.out.println(Start.giuoco.getCounter());
                if (Start.giuoco.getCounter() < 2){//qui ci sono un bel pò di counter ma va bene cosi
                    Start.insertion2 = new PlaceShips();
                    dispose();
                    PlaceShips.counter = 0;// rinizializzo la variabile per la nuova istanza per poter fare l'inserimento
                }
                else {
                    BattelfieldGrid battaglia = new BattelfieldGrid();
                    dispose();
                }
            }
        });






    }
}
