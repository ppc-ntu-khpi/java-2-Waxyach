import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        System.out.println("Введіть ключ:");
        String key = scanner.nextLine();

        String encodedText = Exercise.encrypt(text, key);
        System.out.printf("Результат шифрації: %s\n", encodedText);
        System.out.printf("Результат дешифрації: %s\n", Exercise.decrypt(encodedText, key));
    }
}
