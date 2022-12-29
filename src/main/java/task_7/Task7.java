package task_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        Student s1 = new Student("Dmytro", "Fomin", "PW-122");
        Student s2 = new Student("Dmytro", "Vichkin", "PW-122");
        Student s3 = new Student("Ilja", "Mazurok", "PW-122");
        Student s4 = new Student("Inna", "Bojko", "WPW-121");
        Student s5 = new Student("Igor", "Sumachko", "WPW-121");
        Student s6 = new Student("Viktory", "Livajko", "WPW-121");

        List<Student> listStudent = new ArrayList<>(List.of(s1,s2,s3,s4,s5,s6));
        Map<String, List<Student>> map = listStudent.stream()
                .peek(e -> {
                    e.setFirstname(e.getFirstname().toUpperCase());
                    e.setLastname(e.getLastname().toUpperCase());
                })
                .collect(Collectors.groupingBy(Student::getGroup));

        map.forEach((key, value) ->{
            System.out.println(key + " " + value);
        });
    }
}
