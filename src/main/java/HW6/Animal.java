package HW6;

public abstract class Animal {
    private static int animalsCount;
    private String type;
    private String name;
    private int run;
    private int swim;
    public Animal(String type, String name, int run, int swim) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.swim = swim;
        animalsCount++;
    }
    public static int getAnimalsCount() {
        return animalsCount;
    }
    public void Run(int length) {
        if(run == 0) System.out.printf("%s %s не может бегать!\n", type, name);
        else
            if(run >= length)
                System.out.printf("%s %s пробежал!\n", type, name);
            else System.out.printf("%s %s не смог пробежать!\n", type, name);
    }
    public void Swim(int length) {
        if(swim == 0) System.out.printf("%s %s не умеет плавать!\n", type, name);
        else
            if(swim >= length)
                System.out.printf("%s %s проплыл!\n", type, name);
            else System.out.printf("%s %s не смог проплыть!\n", type, name);
    }
}
