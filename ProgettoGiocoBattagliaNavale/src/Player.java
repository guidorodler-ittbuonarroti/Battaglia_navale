import java.util.ArrayList;

public class Player {
    private String name;

    private ArrayList<Move> shots;
    private Board board;
    Player(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void placeShip(Cell cell){
        board.placeShip(cell);
    }
    public void makeMove(Move move,Board opponentBoard){
        opponentBoard.setMiss(move);//richiamo due volte per disperazione
        opponentBoard.setHIt(move);

    }
}
