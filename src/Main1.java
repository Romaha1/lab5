public class Main1 {
    public static void main(String[] args) {
        int size = 50; // розмір масиву
        int[] number = new int[size];

        int num = 1; // перше непарне число
        for (int i = 0; i < size; i++) {
            number[i] = num;
            num += 2; // збільшуємо на 2 для отримання наступного непарного числа
        }

        // виводимо елементи масиву стовпчиком
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
    }
}
