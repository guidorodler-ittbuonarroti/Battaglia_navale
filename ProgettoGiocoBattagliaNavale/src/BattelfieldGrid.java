import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Thread.sleep;

public class BattelfieldGrid extends JFrame {
    private JPanel pnlGrid;
    private JPanel pnlTitle;
    private JPanel pnlBottom;
    private JLabel lblTitle;
    static Board tabella;
    static Cell currentCell;
    BattelfieldGrid(){
        setTitle("Attacca:"+Start.giuoco.getCurrentPlayer());
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        Board tabella = Start.giuoco.getEnemyBoard();// mi serve sempre quella del nemico
        Cell[][] grid = tabella.getGrid();
        int rows = grid.length;
        int column = grid[0].length;

        pnlGrid = new JPanel(new GridLayout(rows,column));

        for (int i=0; i< rows; i++){
            for (int j =0; j < column; j++){
                JButton btn = new JButton();
                btn.setPreferredSize(new Dimension(100,70));
                btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                btn.setBackground(Color.WHITE);

                if (grid[i][j].getState().equalsIgnoreCase("hit")) {
                    btn.setEnabled(false);
                    btn.setBackground(Color.RED);

                }else if (grid[i][j].getState().equalsIgnoreCase("miss")){
                    btn.setEnabled(false);
                    btn.setBackground(Color.CYAN);

                }
                setVisible(true);
                int finalI = i;
                int finalJ= j; //serve per passare all'interno dell'action listener

                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Cell cellBtn= new Cell(finalI,finalJ);
                        Start.giuoco.play(cellBtn);
                        Board tabella = Start.giuoco.getEnemyBoard();//mi piglio la board dell'avversario
                        Cell[][] gridCheck = tabella.getGrid(); //mi ritiro giu la griglia per verificare dove cavolo è finita quell'azione

                        if (gridCheck[finalI][finalJ].getState().equalsIgnoreCase("hit")){
                            btn.setBackground(Color.RED);
                            try {
                                sleep(100);
                            } catch (InterruptedException ex) {

                            }
                            ActionOutput action = new ActionOutput("hit");
                            dispose();
                        }else {
                            btn.setBackground(Color.CYAN);
                            try {
                                sleep(100);
                            } catch (InterruptedException ex) {

                            }
                            ActionOutput action = new ActionOutput("miss");
                            dispose();
                        }
                    }
                });
                pnlGrid.add(btn);
            }
        }
        add(pnlGrid);//si aggiunge al pannello centrale
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
