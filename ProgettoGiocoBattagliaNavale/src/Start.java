import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame {
    private JPanel pnlPannello;
    private JTextField txtPlayer2;
    private JButton btnInizia;
    private JTextField txtPlayer1;
    private JLabel NomeGiocatore1;
    private JLabel NomeGiocatore2;
    private JLabel lblTitolo;
    static BattleShipGame giuoco;
    Start(){
        setContentPane(pnlPannello);
        setTitle("Welcome");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Player player1=null;
        Player player2=null;
        giuoco= new BattleShipGame("mario","giulio");


        btnInizia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                giuoco.StartGame();
                dispose();
                PlaceShips campo = new PlaceShips();
                InsertionManager insertManager = new InsertionManager();
            }
        });

    }

    public static void main(String[] args) {
        Start gioco = new Start();

    }
}






