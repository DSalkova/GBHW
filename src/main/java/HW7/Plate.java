package HW7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void increaseFood(int foodToIncrease) {
            food += foodToIncrease;
    }
    public boolean decreaseFood(int foodToDecrease) {
        if(food >= foodToDecrease) {
            food -= foodToDecrease;
            return false;
        }
        return true;
    }
    public int getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
