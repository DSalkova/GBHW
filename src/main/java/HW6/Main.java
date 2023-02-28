package HW6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Котик", "Серныш", 50, 20);
        Cat cat2 = new Cat("Котик", "Милаш", 60, 80);
        Cat cat3 = new Cat("Котик", "Рыжик", 70, 0);
        Dog dog1 = new Dog("Пёсик", "Бобик", 100, 170);
        Dog dog2 = new Dog("Пёсик", "Шарик", 0, 80);
        Dog dog3 = new Dog("Пёсик", "Малыш", 120, 190);
        Cat[] cats = {cat1, cat2, cat3};
        Dog[] dogs = {dog1, dog2, dog3};
        for(int rl = 50, sl = 70; rl <= 70 && sl <= 100; rl+=10, sl+=10) {
            System.out.println("Дистанция на бег в " + rl + " метров:");
            for(Cat c : cats)
                c.Run(rl);
            for (Dog d : dogs)
                d.Run(rl);
            System.out.println();
            System.out.println("Дистанция на плавание в " + sl + " метров:");
            for(Cat c : cats)
                c.Swim(sl);
            for (Dog d : dogs)
                d.Swim(sl);
            System.out.println();
        }
        System.out.printf("Всего животных = %s, их них пёсиков = %s, а котиков = %s\n", Animal.getAnimalsCount(), Dog.getDogsCount(), Cat.getCatsCount());
    }
}
