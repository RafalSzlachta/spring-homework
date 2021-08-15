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

    public boolean removeStudentById(Integer id) {
        return studentRepository.removeStudent(getStudentById(id));
    }

    public boolean addNewStudent(Student student) {
        if(studentRepository.findStudentById(student.getId()).isEmpty()) {
            studentRepository.add(student);
            return true;
        } else return false;
    }

    public boolean updateStudentWithId(Integer id, Student student) {
        if(studentRepository.findStudentById(id).isPresent()) {
            return studentRepository.updateStudent(id, student);
        } else return false;
    }
}
