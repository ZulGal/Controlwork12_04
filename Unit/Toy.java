package Controlwork12_04.Unit;
import java.util.Scanner;
import Controlwork12_04.Main;


public abstract class Toy implements ToyInterface{
    protected int id;
    protected String name;
    protected int count;
    protected int weight;
    

    public Toy(int id, String name, int count, int weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight;
                
    }
    
    public Toy() {
    }

    public static Scanner iScanner = new Scanner(System.in);
    
    // public void setToy(){
    //     System.out.println(("Введите идентификатор игрушки: "));
    //     int id = iScanner.nextInt();
    //     System.out.println(("Введите  наименование: "));
    //     String name = iScanner.next();
    //     System.out.println(("Введите количество: "));
    //     int count = iScanner.nextInt();
    //     System.out.println(("Введите вес (частоту выпадения): "));
    //     int weight = iScanner.nextInt();
                    
    //     setId(id);
    //     setName(name);
    //     setCount(count);
    //     setWeight(weight);
    //     // toys.add(toy);
    // }

    @Override
    public String getInfo() {return String.format("%3d %8s %5d %5d",id, name, count, weight);}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
     

    

    

}
