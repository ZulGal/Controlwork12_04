package Controlwork12_04.Unit;

public class Car extends Toy {
    
    public Car(int id, String name, int count, int weight) {
        super(2, "car", 150, 75);
    }
    

@Override
public String getInfo() {return String.format(super.getInfo(), "radio-controlled");}    


}
    
