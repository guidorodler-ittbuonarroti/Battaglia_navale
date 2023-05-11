public class BattleShipGame {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    BattleShipGame(Player player1,Player player2){
        this.player1=player1;
        this.player2=player2;
    }
    public void StartGame(){

    }
    public boolean play(Move move){
        return true;
    }
    public void SwitcPlayer(){
        if (currentPlayer == player1){
            currentPlayer = player2;
        }else {
            currentPlayer = player1;
        }
    }

}
