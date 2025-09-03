package practice_jcf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingEmail {

    public List<String> sortingEmail(List<String> emails) {

        List<String> domainList = new ArrayList<>(); //список для доменов

        for (String email : emails) {
            if (email.contains("@") && (email.indexOf("@") == email.lastIndexOf("@"))) { // проверили что @ есть и что она одна
                String[] separatedEmail = email.toLowerCase().split("@"); //разделили email по символу @ и привели к нижнему регистру
                domainList.add(separatedEmail[1]);
            } else {
                System.out.println("Ошибка в количестве \"@\" адреса: " + email);
            }
        }

        Stream<String> streamDomain = domainList.stream(); // создали поток из коллекции доменов
        List<String> sortedDomainList = streamDomain //список сортированных доменов
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        return sortedDomainList;
    }
}
