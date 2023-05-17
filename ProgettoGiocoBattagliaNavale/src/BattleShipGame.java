public class BattleShipGame {
    private Player player1;
    private Player player2;
    private int counter;
    private Player currentPlayer;
    BattleShipGame(String nome1, String nome2){
        counter=0;
        this.player1=new Player(nome1);
        this.player2=new Player(nome2);
    }
    public void StartGame(){
        currentPlayer = player1;// parto dal player1
    }
    public void play(Cell move){
        if (counter < 2){
            currentPlayer.placeShip(move);
        }else {
            if (currentPlayer.equals(player1)){
                currentPlayer.makeMove(move,player2.getBoard());
            }else{
                currentPlayer.makeMove(move,player1.getBoard());
            }

        }
    }
    public void SwitcPlayer(){
        if (currentPlayer == player1){
            currentPlayer = player2;
            counter++;//conto il numero di switch tra i giocatori poi mi torna utile anche per poi contare i turni
        }else {
            currentPlayer = player1;
            counter++;
        }
    }
    public String getCurrentPlayer(){
        return currentPlayer.getName();
    }

    public Board getCurrentBoard(){
        return currentPlayer.getBoard();
    }

}
