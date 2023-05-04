import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class start extends JFrame{
    private JButton btnInizia;
    private JPanel pnlPannello;
    private JLabel lblBenvenuto;
    private JButton button1;

    start(){
        setContentPane(pnlPannello);
        setTitle("Giuoco pazzo sgravo");
        setSize(950,400);
        setLocation(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println("ciao bro");
            }
        });
    }
    public static void main(String[] args){
        start ciao = new start();

    }

}
