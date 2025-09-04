package practice_jcf;

/*
Задание №3 ч.2 по JCF.
Есть список сотрудников (класс Employee), у каждого есть имя и список навыков (например: Java, SQL, Selenium).
Нужно получить отсортированный список уникальных навыков всех сотрудников.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeUniqueSkills {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", List.of("Java", "Selenium", "Git")),
                new Employee("Bob", List.of("Java", "Docker")),
                new Employee("Eve", List.of("Python", "Selenium", "Git"))
        );

        //создаем список в который вытянем все навыки из каждого экземпляра сотрудника
        List<List> skillsList = new ArrayList<>();

        for (Employee person : employees) {
            skillsList.add(person.getSkills());
        }

        //создаем поток в который развернем все навыки
        Stream<String> skillsStream = skillsList.stream()
                .flatMap(Collection::stream);

        //исключим дубликаты навыков и отсортируем
        skillsStream.sorted().distinct().forEach(System.out::println);
    }
}
