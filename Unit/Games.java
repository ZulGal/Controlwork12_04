package Controlwork12_04.Unit;

public class Games extends Toy {
    
    public Games(int id, String name, int count, int weight) {
        super(4, "games", 12, 30);
    }

    @Override
    public String getInfo() {return String.format(super.getInfo(), "desktop");}  
    
}
