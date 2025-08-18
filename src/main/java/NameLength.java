import java.util.Scanner;

public class NameLength {
    public static void main(String[] args) {

        System.out.println("Введите имя");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();

        int length = name.length();

        if (length > 0 && length <= 20) {
            System.out.println("Успешно! Количество символов в имени равно " + length);
        } else if (length == 0){
            System.out.println("Ошибка! Имя не должно быть пустым!");
        } else {
            System.out.println("Ошибка! Имя содержит более 20 символов");
        }

        scanner.close();

        /* в целом справился сам, chatgpt рекомендовал:
        1. Исключить обрамляющие пробелы
        2. Сделать проверку на пустую строку
         */
    }
}
