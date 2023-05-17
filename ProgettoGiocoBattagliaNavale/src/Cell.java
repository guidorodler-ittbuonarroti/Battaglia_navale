public class Cell {
    private int row;
    private int col;
    private String state;

    Cell(int row,int col){
        state ="water"; //4 stati water,ship,hit,miss
        this.row=row;
        this.col=col;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){

    }

}
