package HW3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork3 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5(6, 3);
        method6();
        System.out.println(method7(new int[]{1, 5, 3, 2, 22, 4, 5, 2, 4, 8, 9, 1}));
    }

    private static void method1() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(2);
        }
        System.out.println("Массив ДО: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Массив ПОСЛЕ: " + Arrays.toString(arr));
    }

    private static void method2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void method3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив ДО: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Массив ПОСЛЕ: " + Arrays.toString(arr));
    }

    private static void method4() {
        int n = 5;
        int[][] arr = new int[n][n];
        System.out.println("Массив ДО:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ThreadLocalRandom.current().nextInt(2,10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив ПОСЛЕ:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                    arr[n-i-1][j] = 1;
                    arr[i][n-j-1] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void method5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void method6() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(10);
        }
        System.out.println("Массив: " + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    private static boolean method7(int[] arr) {
        System.out.println("Массив: " + Arrays.toString(arr));
        boolean flag = false;
        int sumr;
        int suml = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sumr = 0;
            for (int j = arr.length - 1; j >= i +1; j--) {
                sumr += arr[j];
            }
            suml += arr[i];
            System.out.println("Сумма слева = " + suml);
            System.out.println("Сумма справа = " + sumr);
            if (suml == sumr) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
