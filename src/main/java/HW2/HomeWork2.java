package HW2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(checkSum(-8, 13));
        checkVarSign(-3);
        System.out.println(checkVar(0));
        printString("Hello, World!", 3);
        System.out.println(checkYear(800));
    }

    private static boolean checkSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void checkVarSign(int var) {
        if (var >= 0) {
            System.out.println(var + " - положительное число!");
        } else {
            System.out.println(var + " - отрицательное число!");
        }
    }

    private static boolean checkVar(int var) {
        if (var >= 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void printString(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
    private static boolean checkYear(int y) {
        if (y % 4 == 0 && y % 100 != 0) {
            return true;
        } else if (y % 400 == 0) {
            return true; }
        else {
            return false;
        }
    }
}
