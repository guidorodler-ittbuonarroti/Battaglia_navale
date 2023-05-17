import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertionManager extends JFrame {
    private JPanel pnlManager;
    private JButton btnNext;
    private JLabel lblMessage;
    private JLabel lblText;
    private JLabel lblCordinates;
    InsertionManager(){
        setContentPane(pnlManager);
        setTitle("Attendi un attimo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        if (PlaceShips.counter > 17){
            btnNext.setEnabled(false);
            lblMessage.setText("terminare l'inserimento");
        }else {
            lblMessage.setText("ha finito puoi andare avanti");
            btnNext.setEnabled(true);
        }
        if (PlaceShips.counter ==0 ){
                lblCordinates.setText("---");
            }else {
                lblCordinates.setText(""+PlaceShips.currentCell.getCol()+PlaceShips.currentCell.getRow());
            }
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.giuoco.SwitcPlayer();
                PlaceShips.counter =0;
                PlaceShips piazza = new PlaceShips();
            }
        });






    }
}
