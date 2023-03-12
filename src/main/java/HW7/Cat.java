package HW7;

public class Cat {
    private String name;
    private int app;
    private boolean hungry;
    public Cat(String name, int app) {
        this.name = name;
        this.app = app;
        this.hungry = true;
    }
    public void eat(Plate plate) {
        hungry = plate.decreaseFood(app);
    }
    public void makeHungry() {
        hungry = true;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", app=" + app +
                ", hungry=" + hungry +
                '}';
    }
}
