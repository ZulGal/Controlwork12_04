package Controlwork12_04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Controlwork12_04.Unit.Ball;
import Controlwork12_04.Unit.Car;
import Controlwork12_04.Unit.Doll;
import Controlwork12_04.Unit.Games;
import Controlwork12_04.Unit.Robot;
import Controlwork12_04.Unit.Toy;

public class Main {
    public static Scanner iScanner = new Scanner(System.in);
    public static ArrayList<Toy> toys = new ArrayList<>();
    public static ArrayList<Toy> prize = new ArrayList<>();

    public static void main(String[] args) {
        Toy toy = new Toy() {         
        };
        Ball ball = new Ball(0, null, 0, 0);
        Car car = new Car(0, null, 0, 0);
        Doll doll = new Doll(0, null, 0, 0);
        Games games = new Games(0, null, 0, 0);
        Robot robot = new Robot(0, null, 0, 0);
        toys.add(ball);
        toys.add(car);
        toys.add(doll);
        toys.add(games);
        toys.add(robot);

        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).getInfo());
        }

        String main_instruction = "Введите команду 1 -(добавить игрушку),2 -(изменить вес), 3 -(розыгрыш), 4 -(вручить), 0 -(выход):   ";
        int command = 9;
        while (command!=0) {
            System.out.println(main_instruction);
            command = iScanner.nextInt();
                               
            switch (command) {
                case 1:
                    System.out.println(("Введите идентификатор игрушки: "));
                    int id_ = iScanner.nextInt();
                    System.out.println(("Введите  наименование: "));
                    String name_= iScanner.next();
                    System.out.println(("Введите количество: "));
                    int count_ = iScanner.nextInt();
                    System.out.println(("Введите вес (частоту выпадения): "));
                    int weight_= iScanner.nextInt();
                    
                    toy.setId(id_);
                    toy.setName(name_);
                    toy.setCount(count_);
                    toy.setWeight(weight_);
                    toys.add(toy);
                 
                    
                    for (int i = 0; i < toys.size(); i++) {
                        System.out.println(toys.get(i).getInfo());
                    } 
                    break;
                case 2:
                    System.out.println(("Введите идентификатор игрушки: "));
                    id_ = iScanner.nextInt();
                    System.out.println(("Введите вес (частоту выпадения): "));
                    weight_= iScanner.nextInt();
                    for (int i = 0; i < toys.size(); i++) {
                        if (toys.get(i).getId() == id_){
                            toys.get(i).setWeight(weight_);
                        }
                    }
                    for (int i = 0; i < toys.size(); i++) {
                        System.out.println(toys.get(i).getInfo());
                    }        
                    break;
                case 3:
                    for (int i = 0; i < toys.size()-2; i++) {
                        int k = new Random().nextInt(toys.size());
                        prize.add(toys.get(k));
                    }
                    for (int i = 0; i < prize.size(); i++) {
                        System.out.println(prize.get(i).getInfo());
                    }   
                    break;
                case 4:
                    FileWriter fileWriter = null;
                    try {
                        fileWriter = new FileWriter("db.txt");
                        String s =String.format(toys.get(0).getInfo());
                        fileWriter.append(s);
                        fileWriter.flush();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    prize.remove(0);
                    for (int i = 0; i < prize.size(); i++) {
                        System.out.println(prize.get(i).getInfo());
                    }  
                    break;
                
                default:
                    System.out.println("Повторите команду");
            }
        }
        iScanner.close();
    }

}    

