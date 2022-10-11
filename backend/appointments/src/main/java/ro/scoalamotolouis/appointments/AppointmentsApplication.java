package ro.scoalamotolouis.appointments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.scoalamotolouis.appointments.components.DataInitializer;
import ro.scoalamotolouis.appointments.domain.entities.Student;

import java.util.List;

import static java.util.Arrays.asList;

@SpringBootApplication
public class AppointmentsApplication implements CommandLineRunner {

    @Autowired
    private DataInitializer initializer;

    public static void main(String[] args) {
        SpringApplication.run(AppointmentsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        initializer.initStudents();
    }


}
