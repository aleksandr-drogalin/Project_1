package practice_base_course;

public class NameLength {

    public static boolean checkNameLength(String inputName) {
        String name = inputName.trim();
        int length = name.length();

        if (length > 0 && length <= 20) {
            System.out.println("Количество символов в имени " + "\"" + name + "\"" + " равно " + length);
            return true;
        } else if (length == 0) {
            System.out.println("Имя не должно быть пустым!");
            return false;
        } else {
            System.out.println("Имя " + "\"" + name + "\"" + " содержит более 20 символов");
            return false;
        }
    }

        /* в целом справился сам, chatgpt рекомендовал:
        1. Исключить обрамляющие пробелы
        2. Сделать проверку на пустую строку
         */
}
