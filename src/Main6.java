import java.util.Random;
import java.util.Arrays;
public class Main6 {
    public static void main(String[] args) {
        int[][] array = new int[15][];

        // заповнення масиву випадковими значеннями
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            if (i < 4) {
                array[i] = new int[5];
            } else if (i < 8) {
                array[i] = new int[8];
            } else if (i < 12) {
                array[i] = new int[3];
            } else {
                array[i] = new int[9];
            }
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(16);
            }
        }

        // виведення масиву на екран
        for (int i = 0; i < 15; i++) {
            System.out.println("Рядок " + i + ": " + Arrays.toString(array[i]));
        }
    }
}
