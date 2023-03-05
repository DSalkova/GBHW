package HW7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat[] cats = {new Cat("Серныш", 3), new Cat("Милаш", 6), new Cat("Рыжик", 9)};
        System.out.println("Изначальное количество еды в тарелке: " + plate.getFood());
        while (true) {
            for (Cat c : cats) {
                c.eat(plate);
                System.out.println(c);
                System.out.println(plate);
            }
            if(plate.getFood() == 0) break;
            plate.increaseFood(2);
            System.out.println("Еды стало в тарелке после ее добавления: " + plate.getFood());
            for (Cat c : cats) {
                c.makeHungry();
            }
        }
    }
}
