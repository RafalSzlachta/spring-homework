package pl.sda.springhomework.student;

public class StudentNotFoundExeption extends RuntimeException {
    public StudentNotFoundExeption(String id) {
        super("Student with id: " + id + " doesn't exsist");
    }
}
