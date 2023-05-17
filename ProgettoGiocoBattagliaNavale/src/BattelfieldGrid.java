import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattelfieldGrid extends JFrame {
    private JPanel pnlButtons;
    private JPanel pnlTitle;
    private JPanel pnlBottom;
    private JLabel lblTitle;
    static Board tabella;
    static Cell currentCell;
    BattelfieldGrid(){
        setTitle("Partita");
        setSize(900, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        tabella = new Board();
        Cell[][] grid = tabella.getGrid();
        int rows = grid.length;
        int column = grid[0].length;


        pnlButtons = new JPanel(new GridLayout(rows,column));

        for (int i = 0;i< rows; i++){
            for (int j=0; j<rows; j++){
                JButton btn = new JButton();
                btn.setPreferredSize(new Dimension(100,100));
                btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                btn.setBackground(Color.WHITE);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn.setBackground(Color.red);

                    }
                });
                pnlButtons.add(btn);//va aggiunto ogni volta al pannelo
            }

        }
        add(pnlButtons);//si aggiunge al pannello centrale
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
