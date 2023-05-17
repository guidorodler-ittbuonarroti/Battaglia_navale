public class Board {
    private Cell[][] grid;
    Board(){
        grid = new Cell[8][8];

    }
    public void placeShip(Cell ship){
            grid[ship.getRow()][ship.getCol()].setState("ship");//li passo uno alla volta che è piu semplice
    }
    public boolean isHit(Move move){
        if (grid[move.getRow()][move.getCol()].getState().equalsIgnoreCase("ship")){
            grid[move.getRow()][move.getCol()].setState("hit");
            return true;
        }else {
            return false;
        }
    }
    public boolean isMiss(Move move){
        if (grid[move.getRow()][move.getCol()].getState().equalsIgnoreCase("water")){
            grid[move.getRow()][move.getCol()].setState("miss");
            return true;
        }else {
            return false;
        }

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

    public Cell[][] getGrid(){
        return grid;
    }

}
