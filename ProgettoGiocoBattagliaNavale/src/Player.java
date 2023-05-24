import java.util.ArrayList;

public class Player {
    private String name;
    private Board board;

    private int navi_colpire;
    Player(String name){
        this.name = name;
        board = new Board();
        navi_colpire = 15;
    }
    public String getName(){
        return name;
    }
    public void placeShip(Cell cell){
        board.placeShip(cell);
    }
    public void makeMove(Cell move,Board opponentBoard){
        opponentBoard.setMiss(move);//richiamo due volte per disperazione
        if (opponentBoard.setHIt(move)){
            navi_colpire--;//quando uno dei due ha colpito 15 navi il gioco finisce
        }
    }

    public int getToHit(){
        return navi_colpire;
    }
    public Board getBoard(){
        return board;
    }
}
