package Controlwork12_04.Unit;

public class Ball extends Toy{
    public Ball(int id, String name,int count, int weight) {
        super(1, "ball", 25, 50);
    }
    
    @Override
    public String getInfo() {return String.format(super.getInfo(), "football");}  
    
}
