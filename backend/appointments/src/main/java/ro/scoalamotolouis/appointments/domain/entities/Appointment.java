package ro.scoalamotolouis.appointments.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.scoalamotolouis.appointments.domain.enums.AppointmentType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class Appointment {
    @GeneratedValue
    @Id
    private int id;

    private LocalDateTime date;

    private AppointmentType type;

    private Motorcycle  motorcycle;
}
