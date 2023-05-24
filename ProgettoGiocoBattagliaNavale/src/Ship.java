import javafx.scene.control.Cell;

import java.util.ArrayList;

public class Ship {
    private String name;
    private int lenght;
    private ArrayList<Cell> position;

    Ship(String name, int lenght){
        this.name=name;
        this.lenght=lenght;
    }
    public  String getName(){
        return name;
    }
    public int getLenght(){
        return lenght;
    }
    public ArrayList<Cell> getPosition(){
        return null;
    }
    public boolean setPosition(ArrayList<Cell> cells){
        return true;
    }


}
