package HW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();
    //Создание игрового поля:
    public static final int SIZE = 3;
    public static char[][] map = new char[SIZE][SIZE];
    public static final int WS = 3;
    //Ячейки поля:
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    //Счётчик ходов:
    public static int count = 0;
    //Тест программы:
    public static void main(String[] args) {
        do {
            System.out.println("Игра начинается!");
            initMap();
            printMap();
            playGame();
        } while (isContinueGame());
        System.out.println("count = " + count);
    }
    //Проверка на продолжение игры:
    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y/n");
        return switch (sc.next()) {
            case "y", "у", "н", "e" -> true;
            default -> false;
        };
    }
    //Инициализация поля:
    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    //Вывод поля в консоль:
    public static void printMap() {
        printHeaderMap();
        printBodyMap();
        //System.out.println();
    }
    //Печать самого поля:
    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumbers(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Печать нумерации поля:
    private static void printMapNumbers(int i) {
        System.out.print((i + 1) + " ");
    }
    //Печать шапки поля:
    private static void printHeaderMap() {
        System.out.print(" " + " ");
        for (int i = 0; i < SIZE; i++) {
            printMapNumbers(i);
        }
        System.out.println();
    }
    //Логика игры:
    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена!");
    }
    //Ход человека:
    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты ячейки в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            if(isCellFree(x, y)) break;
            System.out.println("Данная ячейка уже занята!");
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
        count++;
    }
    //Проверка ячеек на пустоту:
    private static boolean isCellFree(int x, int y) {
        return map[x][y] == DOT_EMPTY;
    }
    //Проверка ячеек на валидность:
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }
    //Ход компьютера:
    public static void aiTurn() {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
            if(isCellFree(x, y)) break;
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сделал ход в ячейку: " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
        count++;
        }
    //Проверка победы:
    public static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
    //Проверка на заполненность поля (ничья):
    public static boolean isMapFull() {
        return count >= SIZE * SIZE;
    }
}
