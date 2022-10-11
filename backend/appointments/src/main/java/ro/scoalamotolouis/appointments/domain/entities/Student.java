package ro.scoalamotolouis.appointments.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "STUDENT")
public class Student {
    @GeneratedValue
    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    private int age;

    private boolean carDrivingLicense;
}
