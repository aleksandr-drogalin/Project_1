package practice_jcf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Задание №1 по JCF.
Есть список email-адресов. Нужно вернуть отсортированный по алфавиту список
уникальных доменов (часть после @), без учета регистра.
*/

public class SortingEmail {

    public static List<String> sortingEmail(List<String> emails) {

        List<String> domainList = new ArrayList<>(); //список для доменов

        for (String email : emails) {
            if (email.contains("@") && (email.indexOf("@") == email.lastIndexOf("@"))) { // проверили что @ есть и что она одна
                String[] separatedEmail = email.toLowerCase().split("@"); //разделили email по символу @ и привели к нижнему регистру
                domainList.add(separatedEmail[1]);
            } else {
                System.out.println("Ошибка в количестве \"@\" адреса: " + email);
            }
        }

        List<String> sortedDomainList = domainList.stream() //список сортированных доменов
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        return sortedDomainList;
    }

    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "USER2@GMAIl.COM",
                "admin@yahoo.com",
                "test@mail.ru"
        );

        List<String> sortedEmails = SortingEmail.sortingEmail(emails);
        System.out.println(sortedEmails);
    }
}