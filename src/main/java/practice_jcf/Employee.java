package practice_jcf;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/*
Задание №3 ч.1 по JCF.
Есть список сотрудников, у каждого есть имя и список навыков (например: Java, SQL, Selenium).
Нужно получить отсортированный список уникальных навыков всех сотрудников (Класс EmployeeUniqueSkills).
 */

@Data
@AllArgsConstructor
class Employee {
    String name;
    List<String> skills;
}

