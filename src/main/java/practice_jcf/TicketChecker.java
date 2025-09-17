package practice_jcf;


/*
Задание №2 по JCF.
Написать метод, который принимает строку ровно и 6 цифр (например, "385916") и
возвращает true, если это счастливый билет. Счастливый билет тот, чья сумма первых трех цифр
равна сумме последних трех
 */

public class TicketChecker {
    public static boolean isLuckyTicket(String ticket) {

        boolean result;
        int sum1 = 0;
        int sum2 = 0;

        // проверяем что в билете четное количество символов
        if (ticket.length()%2 == 0) {

            //только цифры
            boolean isAllDigits = ticket.chars()
                    .allMatch(Character::isDigit);

            if (isAllDigits) {
                int[] numberTicketAsInt = ticket.chars()
                        .map(Character::getNumericValue)
                        .toArray();

                //левая часть билета
                for (int i = 0; i < ticket.length()/2; i++) {
                    sum1 = sum1 + numberTicketAsInt[i];
                }

                //правая часть билета
                for (int i = ticket.length()/2; i < ticket.length(); i++) {
                    sum2 = sum2 + numberTicketAsInt[i];
                }

                System.out.println("Сумма первых трех чисел: " + sum1);
                System.out.println("Сумма последних трех чисел: " + sum2);

                result = sum1 == sum2;

            } else {
                System.out.println("Билет должен содержать только цифры");
                result = false;
            }
        } else {
            System.out.println("Номер билета должен содержать четное количество символов!");
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isLuckyTicket("123321")); //true
        System.out.println(isLuckyTicket("11112222")); //false
    }
}