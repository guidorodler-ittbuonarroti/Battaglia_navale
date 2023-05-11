public class Board {
    private Cell[][] grid;
    Board(){
        grid = new Cell[8][8];
    }
    public boolean placeShip(Ship ship){
        return true;
    }
    public boolean isHit(Move move){
        return true;
    }
    public boolean isMiss(Move move){
        return false;

    }
    public void setHIt(Move move){
        if (isHit(move)){
            grid[move.getCol()][move.getRow()].setState("hit");
        }
    }
    public void setMiss(Move move){
        if (isMiss(move)){
            grid[move.getCol()][move.getRow()].setState("miss");
        }
    }
    public boolean isShipPlaced(Ship ship){
        return true;
    }
    public Cell[][] getGrid(){
        return grid;
    }

}
