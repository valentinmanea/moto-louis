package ro.scoalamotolouis.appointments.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.scoalamotolouis.appointments.domain.entities.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
}
