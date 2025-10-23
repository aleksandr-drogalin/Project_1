package practice_base_course;

public class Email {

    public static boolean checkEmail(String email) {

        if (email.contains("@")) {
            int indexAt = email.indexOf("@");
            int indexPoint = email.indexOf(".", indexAt);
            if (indexPoint == -1) {
                System.out.println("Отсутствует символ \".\" после \"@\"");
                return false;
            } else {
                System.out.println("В email " +email + " cимвол \"@\" по счету " + (indexAt+1) + "-й, и символ \".\" по счету " + (indexPoint - indexAt) + "-й после @");
                return true;
            }
        } else {
            System.out.println("Отсутствует символ \"@\"");
            return false;
        }
    }
}
