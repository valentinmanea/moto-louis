package ro.scoalamotolouis.appointments.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.scoalamotolouis.appointments.domain.enums.MotorcycleType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Motorcycle {
    @GeneratedValue
    @Id
    private int id;

    private String brand;

    private MotorcycleType type;

}
