package pl.sda.springhomework.student;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
class StudentRepository {
    private List<Student> students;

    @PostConstruct
    void addSampleStudents() {
        students = new ArrayList<>();
        students.add(new Student(0, "Agata", (short) 22, Gender.FEMALE));
        students.add(new Student(1, "Romek", (short) 23, Gender.MALE));
        students.add(new Student(2, "Piotrek", (short) 21, Gender.MALE));
        students.add(new Student(3, "Martyna", (short) 20, Gender.FEMALE));
        students.add(new Student(4, "Karolina", (short) 25, Gender.FEMALE));
    }

    List<Student> findAllStudents() {
        return students;
    }

    Optional<Student> findStudentById(Integer id) {
        try {
            return students.stream().filter(x -> id.equals(x.getId())).findFirst();
        } catch (IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }

    boolean removeStudent(Student student) {
        return students.remove(student);
    }

    void add(Student student) {
        students.add(student);
    }

    public boolean updateStudent(Integer id, Student student) {
        Student studentToUpdate = students.stream().filter(x -> id.equals(x.getId())).findFirst().get();
        if (student.getAge()!=null) studentToUpdate.setAge(student.getAge());
        if (student.getName()!=null) studentToUpdate.setName(student.getName());
        if (student.getGender()!=null) studentToUpdate.setGender(student.getGender());
        return true;
    }
}
