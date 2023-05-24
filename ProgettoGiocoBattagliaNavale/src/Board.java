public class Board {
    private Cell[][] grid;
    Board(){
        grid = new Cell[8][8];
        initGrid();

    }
    private void initGrid(){
        for (int i =0; i< grid.length; i++){
            for (int j=0; j< grid[0].length; j++){
                grid[i][j] = new Cell(i,j);
                grid[i][j].setState("water");
            }
        }
    }
    public void placeShip(Cell ship){
        grid[ship.getRow()][ship.getCol()].setState("ship");//li passo uno alla volta che è piu semplice
    }
    public boolean isHit(Cell move){
        if (grid[move.getRow()][move.getCol()].getState().equalsIgnoreCase("ship")){
            return true;
        }else {
            return false;
        }
    }
    public boolean isMiss(Cell move){
        if (grid[move.getRow()][move.getCol()].getState().equalsIgnoreCase("water")){
            return true;
        }else {
            return false;
        }

    }
    public boolean setHIt(Cell move){
        if (isHit(move)){
            System.out.println("ho fatto qualcosa");
            grid[move.getRow()][move.getCol()].setState("hit");//lo ho tolto dall'is hit
            return true;
        }else {
            return false;
        }

    }
    public void setMiss(Cell move){
        if (isMiss(move)){
            grid[move.getRow()][move.getCol()].setState("miss");//lo ho tolto dal isMiss
        }
    }

    public Cell[][] getGrid(){
        return grid;
    }

}
