public class CapitalLetter {

    public static boolean checkStartCapitalLetter(String line) {
        boolean result = false;
        String comment = "Строка " + "\"" + line + "\"" + " не начинается с заглавной буквы";

        char firstChar = line.charAt(0);
        String startCharLine = String.valueOf(firstChar);

        String[] capitalLetters = {"A", "B", "C", "D", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "А", "Б", "В", "Г", "Д", "Е", "Ё",
                "Ж", "З", "И", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш",
                "Щ", "Ъ", "Ь", "Э", "Ю", "Я"};

        for (String symbol : capitalLetters) {
            if (symbol.equals(startCharLine)) {
                result = true;
                comment = "Строка " + "\"" + line + "\"" + "  начинается c заглавной буквы";
            }

        }
        System.out.println(comment);
        return result;
    }
}