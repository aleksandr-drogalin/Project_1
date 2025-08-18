import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        System.out.println("Введите число");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное!");
        } else {
            System.out.println("Число нечетное!");
        }

        scanner.close(); // О том что нужно закрывать подсказал chatgpt
    }
}
