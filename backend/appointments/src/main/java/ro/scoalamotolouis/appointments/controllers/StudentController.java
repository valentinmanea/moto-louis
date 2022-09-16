package ro.scoalamotolouis.appointments.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.scoalamotolouis.appointments.domain.entities.Student;
import ro.scoalamotolouis.appointments.domain.repositories.StudentRepo;
import ro.scoalamotolouis.appointments.services.StudentService;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> getStudents(){
        return studentService.findAll();
    }
}
