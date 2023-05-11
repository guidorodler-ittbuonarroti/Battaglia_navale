import javax.swing.*;
import java.awt.*;

public class BattelfieldGrid extends JFrame {
    private JPanel pnlButtons;
    private JPanel pnlTitle;
    private JPanel pnlBottom;
    static Board tabella;
    BattelfieldGrid(){
        setTitle("Partita");
        setSize(1200, 1400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabella = new Board();
        Cell[][] grid = tabella.getGrid();
        int rows = grid.length;
        int column = grid[0].length;


        pnlButtons = new JPanel(new GridLayout(rows,column));

        for (int i = 0;i< rows; i++){
            for (int j=0; j<rows; j++){
                JButton button= new JButton();
                button.setPreferredSize(new Dimension(100,100));

            }
        }
    }
}
