package HW6;

public class Cat extends Animal{
    private static int catsCount;
    public Cat(String type, String name, int run, int swim) {
        super(type, name, run, swim);
        catsCount++;
    }
    public static int getCatsCount() {
        return catsCount;
    }
}
