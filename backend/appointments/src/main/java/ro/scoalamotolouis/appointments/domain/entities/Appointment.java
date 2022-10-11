package ro.scoalamotolouis.appointments.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.scoalamotolouis.appointments.domain.enums.AppointmentType;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Appointment {
    @GeneratedValue
    @Id
    private int id;

    private LocalDateTime date;

    private AppointmentType type;

    @ManyToOne
    private Motorcycle  motorcycle;
}
