package ro.scoalamotolouis.appointments.components;

import org.springframework.stereotype.Component;
import ro.scoalamotolouis.appointments.domain.entities.Student;
import ro.scoalamotolouis.appointments.domain.repositories.StudentRepo;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class DataInitializer {

    private final StudentRepo studentRepo;

    public DataInitializer(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void initStudents(){
        studentRepo.saveAll(buildStudents());
    }
    private static List<Student> buildStudents() {
        Student student1 = new Student(null, "Valentin", "Manea", 26, true);
        Student student2 = new Student(null, "Andrei", "Popescu", 25, false);
        Student student3 = new Student(null, "Ciprian", "Grigore", 26, true);
        return asList(student1, student2, student3);
    }
}
