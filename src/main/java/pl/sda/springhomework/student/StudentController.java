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
    Student getStudentById(@PathVariable final Integer id) {
        return studentService.getStudentById(id);
    }

    @GetMapping
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    boolean removeStudentById(@PathVariable final Integer id) {
        return studentService.removeStudentById(id);
    }

    @PostMapping
    boolean createStudent(@RequestBody final Student student) {
        return studentService.addNewStudent(student);
    }
}
