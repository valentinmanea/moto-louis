package ro.scoalamotolouis.appointments.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AppointmentsController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello");
        return "Hello";
    }
}
