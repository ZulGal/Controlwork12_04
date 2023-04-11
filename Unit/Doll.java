package Controlwork12_04.Unit;
public class Doll extends Toy {
    public Doll(int id, String name,int count, int weight) {
        super(3, "doll", 15, 50);
    }
    
    @Override
    public String getInfo() {return String.format(super.getInfo(), "baby");}  
}    
    

    