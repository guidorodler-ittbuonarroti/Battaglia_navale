import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class start extends JFrame{
    private JButton btnInizia;
    private JPanel pnlPannello;
    private JLabel lblBenvenuto;

    start(){
        setContentPane(pnlPannello);
        setTitle("Giuco pazzo sgravo");
        setSize(950,400);
        setLocation(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnInizia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args){
        start ciao = new start();

    }

}
