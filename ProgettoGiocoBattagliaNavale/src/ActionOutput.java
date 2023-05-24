import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionOutput extends JFrame {
    private JButton btnGoOn;
    private JPanel pnlAction;
    private JLabel lblAction;

    ActionOutput(String action){
        setContentPane(pnlAction);
        setTitle("Procedi");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        lblAction.setText(action);
        btnGoOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Start.giuoco.getToHitShips());
                  if (Start.giuoco.getToHitShips() > 0){
                      Start.giuoco.SwitchPlayer();
                      BattelfieldGrid battaglia = new BattelfieldGrid();
                      dispose();
                  }else {
                       Victory vittoria = new Victory(Start.giuoco.getCurrentPlayer());
                  }

            }
        });
    }

}
