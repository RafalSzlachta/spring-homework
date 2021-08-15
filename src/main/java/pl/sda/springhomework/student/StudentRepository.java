package pl.sda.springhomework.student;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
class StudentRepository {
    private List<Student> students;

    @PostConstruct
    void addSampleStudents() {
        students = new ArrayList<>();
        students.add(new Student("Agata", (short) 22, Gender.FEMALE));
        students.add(new Student("Romek", (short) 23, Gender.MALE));
        students.add(new Student("Piotrek", (short) 21, Gender.MALE));
        students.add(new Student("Martyna", (short) 20, Gender.FEMALE));
        students.add(new Student("Karolina", (short) 25, Gender.FEMALE));
    }
}
