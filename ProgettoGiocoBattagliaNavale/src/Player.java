import java.util.ArrayList;

public class Player {
    private String name;
    private Board board;
    Player(String name){
        this.name = name;
        board = new Board();
    }
    public String getName(){
        return name;
    }
    public void placeShip(Cell cell){
        board.placeShip(cell);
    }
    public void makeMove(Cell move,Board opponentBoard){
        opponentBoard.setMiss(move);//richiamo due volte per disperazione
        opponentBoard.setHIt(move);
    }
    public Board getBoard(){
        return board;
    }
}
