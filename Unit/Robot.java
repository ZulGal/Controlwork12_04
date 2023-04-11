package Controlwork12_04.Unit;

public class Robot extends Toy{
    String feature;

    public Robot(int id, String name, int count, int weight) {
        super(5, "robot", 50, 30);
    }
    @Override
    public String getInfo() {return String.format(super.getInfo(), "lego");}  
}
