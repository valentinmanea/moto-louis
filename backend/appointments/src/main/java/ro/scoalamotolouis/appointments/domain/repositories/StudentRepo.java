package ro.scoalamotolouis.appointments.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.scoalamotolouis.appointments.domain.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
