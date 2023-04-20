import java.util.Arrays;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        // створення 2 масивів
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        // заповнення масивів випадковими числами з відрізка [0; 10]
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(11);
            array2[i] = random.nextInt(11);
        }

        // створення третього пустого масиву
        int[] array3 = new int[10];

        // обчислення суми елементів перших двох масивів та запис у третій масив
        for (int i = 0; i < 10; i++) {
            array3[i] = array1[i] + array2[i];
        }

        // виведення масивів у консоль
        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));
        System.out.println("Масив 3 (сума елементів перших двох масивів): " + Arrays.toString(array3));
    }
}
