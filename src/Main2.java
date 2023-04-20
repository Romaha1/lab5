import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int size = 20; // розмір масиву
        int[] randomNumbers = new int[size];

        // заповнюємо масив випадковими числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(10); // генеруємо число від 0 до 9
        }

        // виводимо початковий масив у консоль
        System.out.println("Початковий масив:");
        for (int i = 0; i < size; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();

        // замінюємо елементи з непарним індексом на 0
        for (int i = 1; i < size; i += 2) {
            randomNumbers[i] = 0;
        }

        // виводимо оновлений масив у консоль
        System.out.println("Оновлений масив:");
        for (int i = 0; i < size; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
    }
}
