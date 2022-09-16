package ro.scoalamotolouis.appointments.services;

import org.springframework.stereotype.Service;
import ro.scoalamotolouis.appointments.domain.entities.Student;
import ro.scoalamotolouis.appointments.domain.repositories.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public void removeStudentById(Integer id) {
        studentRepo.deleteById(id);
    }

    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}
