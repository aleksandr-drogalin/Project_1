package practice_base_course;

public class EvenNumber {

    public static boolean checkEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное!");
            return true;
        } else {
            System.out.println("Число " + number + " не четное!");
            return false;
        }
    }
}
