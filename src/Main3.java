import java.util.Arrays;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        // створення 3 масивів
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];

        // заповнення масивів випадковими числами з відрізка [0; 5]
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(6);
            array2[i] = random.nextInt(6);
            array3[i] = random.nextInt(6);
        }

        // виведення масивів у консоль
        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));
        System.out.println("Масив 3: " + Arrays.toString(array3));

        // підрахунок середнього арифметичного кожного масиву
        double average1 = Arrays.stream(array1).average().orElse(Double.NaN);
        double average2 = Arrays.stream(array2).average().orElse(Double.NaN);
        double average3 = Arrays.stream(array3).average().orElse(Double.NaN);

        // порівняння значень середнього арифметичного кожного масиву
        if (average1 > average2 && average1 > average3) {
            System.out.println("Середнє арифметичне масиву 1 більше за інші масиви");
        } else if (average2 > average1 && average2 > average3) {
            System.out.println("Середнє арифметичне масиву 2 більше за інші масиви");
        } else if (average3 > average1 && average3 > average2) {
            System.out.println("Середнє арифметичне масиву 3 більше за інші масиви");
        } else {
            System.out.println("Середні арифметичні масивів рівні");
        }
    }
}
