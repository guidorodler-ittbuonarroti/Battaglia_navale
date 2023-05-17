import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlaceShips extends JFrame {
    private JPanel pnPannello;
    private JPanel pnlGrid;
    private JPanel pnlTitle;
    static int counter;//mi serve per verificare il numero di navi inserite
    static Cell currentCell;
    PlaceShips(){
        setContentPane(pnPannello);
        setTitle("Piazza navi:"+Start.giuoco.getCurrentPlayer());
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        pnlGrid = new JPanel();
        Board tabella = Start.giuoco.getCurrentBoard();
        Cell[][] grid = tabella.getGrid();
        int rows = grid.length;
        int column = grid[0].length;

        pnlGrid = new JPanel(new GridLayout(rows,column));

        for (int i=0; i< rows; i++){
            for (int j =0; j < column; j++){
                JButton btn = new JButton();
                btn.setPreferredSize(new Dimension(100,70));
                btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                btn.setBackground(Color.CYAN);
                setVisible(true);
                int finalI = i;
                int finalJ= j; //serve per passare all'interno dell'action listener
                btn.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         if (counter < 15){
                             Cell cellBtn= new Cell(finalI,finalJ);//cella da passare alla placeship
                             currentCell = cellBtn;//da stampare in inserionManager
                             btn.setBackground(Color.gray);
                             btn.setEnabled(false);//tolgo il pulsante
                             Start.giuoco.play(cellBtn);
                             counter++;
                         }
                     }
                 });
            pnlGrid.add(btn);
            }
        }
        //add(pnlGrid);//si aggiunge al pannello centrale
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
