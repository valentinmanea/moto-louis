package ro.scoalamotolouis.appointments.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @GeneratedValue
    @Id
    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private boolean carDrivingLicense;


}
