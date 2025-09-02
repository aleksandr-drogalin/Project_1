package practice_base_course;

public class CapitalLetter {
    public static boolean checkStartCapitalLetter(String line) {
        if (line == null || line.isEmpty()) {
            System.out.println("Строка не должна быть пустой!");
            return false;
        }

        char firstChar = line.charAt(0);

        boolean isCapital = Character.isUpperCase(firstChar);
        String comment = String.format("Строка \"%s\" %s", line, isCapital ? "начинается с заглавной буквы" : "не начинается с заглавной буквы");
        System.out.println(comment);

        return isCapital;
    }
}