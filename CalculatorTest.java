package Test4;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        int sum = 0;
        int k = 0;
        Scanner ad = new Scanner(System.in);
        int n = ad.nextInt();
        int m = ad.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int Cn = ad.nextInt();
            array[i] = Cn;
            sum = array[i] + sum;
        }
        int result = sum / m;
        if (result < 1) {
            System.out.println("0");
            return;
        }
        result++;
        while (k < m) {
            k = 0;
            for (int i = 0; i < n; i++) {
                k = array[i] / (result - 1) + k;
            }
            result--;
        }
        System.out.println(result);
        System.out.println(result);
    }
}
