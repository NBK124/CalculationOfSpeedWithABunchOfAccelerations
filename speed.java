import java.util.Scanner;
import java.util.Arrays;

public class CalculateSpeedWithAccelerations {
    public static long printing(String text) {
        Scanner jin = new Scanner(System.in);
        long temp = 0;
        System.out.print("Введите " + text + ": ");
        try {
            temp = jin.nextLong();
            if (temp <= 0) {
                System.out.println("Неверные данные");
                temp = printing(text);
            }
        } catch (Exception e) {
            System.out.println("Неверные данные!");
            temp = printing(text);
        } return temp;
    }
    public static double va(String text) {
        Scanner jin = new Scanner(System.in);
        double temp = 0.0;
        System.out.print("Введите " + text + ": ");
        try {
            temp = jin.nextDouble();
        } catch (Exception e) {
            System.out.println("Неверные данные!");
            temp = va(text);
        } return temp
    ;}
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        long howMany = printing("кол-во ускорений");
        double[] speeds = new double[(int)howMany + 1];
        speeds[0] = va("начальную скорость");
        for (long i = 1; i <= howMany; i++) {
            speeds[(int)i] = va(i + "-ое ускорение");
        } long howLong = printing("кол-во итераций");
        for (long i = 1; i <= howLong; i++) {
            System.out.println(i + "-ая итерация");
            for (long j = 0; j < howMany; j++) {
                speeds[(int)j] += speeds[(int)j + 1];
            } System.out.println(Arrays.toString(speeds) + "\n");
        } jin.close();
    }
}
