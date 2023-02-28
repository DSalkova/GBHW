package HW6;

public class Dog extends Animal{
    private static int dogsCount;
    public Dog(String type, String name, int run, int swim) {
        super(type, name, run, swim);
        dogsCount++;
    }
    public static int getDogsCount() {
        return dogsCount;
    }
}
