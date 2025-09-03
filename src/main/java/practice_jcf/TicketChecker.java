package practice_jcf;

public class TicketChecker {
    public static boolean isLuckyTicket(String ticket) {

        boolean result;
        boolean correctLenght;
        boolean isNumber = true;

        // проверяем что в билете 6 символов
        if (ticket.length() == 6) {
            correctLenght = true;
        } else {
            System.out.println("Номер билета должен содержать 6 символов!");
            correctLenght = false;
        }

        char[] charNumberTicket = ticket.toCharArray(); // массив с исходными СИМВОЛАМИ

        // проверяем, что массив символов содержит только цифры
        for (char symbol : charNumberTicket) {
            if (!Character.isDigit(symbol)) {
                isNumber = false;
                System.out.println("Номер билета должен содержать только цифры!");
                break;
            }
        }

        // если все хорошо, то считаем левую и правую части билета
        if (correctLenght && isNumber) {

            int[] intNumberTicket = new int[6]; // массив с полученными числами

            // Заполняем массив чисел
            for (int i = 0; i < 6; i++) {
                intNumberTicket[i] = Character.getNumericValue(charNumberTicket[i]);
            }

            int sum1 = 0;
            int sum2 = 0;

            //левая часть билета
            for (int i = 0; i < 3; i++) {
                sum1 = sum1 + intNumberTicket[i];
            }

            //правая часть билета
            for (int i = 3; i < 6; i++) {
                sum2 = sum2 + intNumberTicket[i];
            }

            System.out.println("Сумма первых трех чисел: " + sum1);
            System.out.println("Сумма вторых трех чисел: " + sum2);

            result = sum1 == sum2;
        } else {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isLuckyTicket("123321")); //true
        System.out.println(isLuckyTicket("111222")); //false
    }
}