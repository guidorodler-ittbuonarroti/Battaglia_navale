import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PlaceSHIP extends JFrame {

    private JPanel pnlPannello;
    private JButton button1;
    private JButton button2;
    private JButton casellaButton;
    private JButton casellaButton1;
    private JButton casellaButton2;
    private JButton casellaButton3;
    private JButton casellaButton4;
    private JButton casellaButton5;
    private JButton casellaButton6;
    private JButton casellaButton7;
    private JButton casellaButton8;
    private JButton casellaButton9;
    private JButton casellaButton10;
    private JButton casellaButton11;
    private JButton casellaButton12;
    private JButton casellaButton13;
    private JButton casellaButton14;
    private JButton casellaButton15;
    private JButton casellaButton16;
    private JButton casellaButton17;
    private JButton casellaButton18;
    private JButton casellaButton19;
    private JButton casellaButton20;
    private JButton casellaButton21;
    private JButton casellaButton22;
    private JButton casellaButton23;
    private JButton casellaButton24;
    private JButton casellaButton25;
    private JButton casellaButton26;
    private JButton casellaButton27;
    private JButton casellaButton28;
    private JButton casellaButton29;
    private JButton casellaButton30;
    private JButton casellaButton31;
    private JButton casellaButton32;
    private JButton casellaButton33;
    private JButton casellaButton34;
    private JButton casellaButton35;
    private JButton casellaButton36;
    private JButton casellaButton37;
    private JButton casellaButton38;
    private JButton casellaButton39;
    private JButton casellaButton40;
    private JButton casellaButton41;
    private JButton casellaButton42;
    private JButton casellaButton43;
    private JButton casellaButton44;
    private JButton casellaButton45;
    private JButton casellaButton46;
    private JButton casellaButton47;
    private JButton casellaButton48;
    private JButton casellaButton49;
    private JButton casellaButton50;
    private JButton casellaButton51;
    private JButton casellaButton52;
    private JButton casellaButton53;
    private JButton casellaButton54;
    private JLabel crntPlayer;
    private JButton btnProsegui;
    private JLabel lblAction;

    PlaceSHIP(){
        setContentPane(pnlPannello);
        setTitle("Welcome");
        setSize(900,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ArrayList<Cell> doppia = new ArrayList<Cell>();//mi serve per memorizzare

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row =1;
                int col = 1;
                Cell cella = new Cell(row,col);


            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = 1;
                int col = 1;
                Cell cella = new Cell(row,col);
            }
        });
    }
}
