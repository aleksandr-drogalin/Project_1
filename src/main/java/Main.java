public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        //Проверяем четное ли число, результат выводим в консоль
        System.out.println(EvenNumber.checkEvenNumber(11));

        System.out.println("\nЗадание №2");
        //Проверяем что введенное имя содержит не более 20 символов (gpt подсказала включить в проверку пустую строку)
        System.out.println(NameLength.checkNameLength("Александр"));

        System.out.println("\nЗадание №3");
        //Метод принимает массив (размер задаем, значения - рандом) и возвращает обратный. Исходный и полученный выводим в консоль
        ReverseArray.reverseRandomArray(8);

        System.out.println("\nЗадание №4");
        //Проверяем начинается ли строка с заглавной буквы
        System.out.println(CapitalLetter.checkStartCapitalLetter("Hello World!"));

        System.out.println("\nЗадание №5");
        //Метод принимает email  и проверяет есть ли в нем символ @ и точка после него
        System.out.println(Email.checkEmail("post@gmail.com"));

        System.out.println("\nЗадание №6");
        //Вызвать метод isLucky() всегда возвращающий true
        Ticket ticket = new Ticket(556891);
        System.out.println(ticket.isLucky());
    }
}
