import java.util.Arrays;
import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        System.out.println("Масив: " + Arrays.toString(array));

        int count = 0;
        for (int j : array) {
            if (j % 2 == 0 && j != 0) {
                count++;
            }
        }

        System.out.println("Кількість парних елементів у масиві: " + count);
    }
}
