package pl.sda.springhomework.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAllStudents();
    }

    public Student getStudentById(Integer id) {
        return studentRepository
                .findStudentById(id)
                .orElseThrow(() -> new StudentNotFoundExeption(id.toString()));
    }

    public void removeStudentById(Integer id) {
        studentRepository.removeStudent(getStudentById(id));
    }
}
