import javax.swing.*;
import java.awt.*;
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
        if (PlaceShips.counter < 15){
            btnNext.setEnabled(false);
            lblMessage.setText("terminare l'inserimento");
        }else {
            lblMessage.setText("ha finito puoi andare avanti");
            btnNext.setEnabled(true);
        }

        while (PlaceShips.counter<15){
            if (PlaceShips.counter ==0){
                lblCordinates.setText("---");
            }else {
                lblCordinates.setText(""+PlaceShips.currentCell.getCol()+PlaceShips.currentCell.getRow());
            }

        }




    }
}
