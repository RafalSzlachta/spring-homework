package pl.sda.springhomework.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/students")
class StudentController {
    private final StudentService studentService;

    @GetMapping("/{id}")
    Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @GetMapping
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    void removeStudentById(@PathVariable Integer id) {
        studentService.removeStudentById(id);
    }

}
