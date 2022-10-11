package ro.scoalamotolouis.appointments.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.scoalamotolouis.appointments.domain.entities.Motorcycle;

public interface MotorcycleRepo extends JpaRepository<Motorcycle, Integer> {
}
