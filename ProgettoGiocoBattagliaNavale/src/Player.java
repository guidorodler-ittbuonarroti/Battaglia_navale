import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Ship> ships;
    private ArrayList<Move> shots;
    private Board board;
    Player(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean placeShip(Ship ship){
        return false;
    }
    public void makeMove(Move move,Board opponentBoard){

    }
}
