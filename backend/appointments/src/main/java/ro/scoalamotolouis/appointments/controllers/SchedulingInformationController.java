package ro.scoalamotolouis.appointments.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.scoalamotolouis.appointments.domain.SchedulingInformation;
import ro.scoalamotolouis.appointments.services.SchedulingInformationService;

@RestController
@RequestMapping("/scheduling")
@CrossOrigin
public class SchedulingInformationController {

    private final SchedulingInformationService schedulingInformationService;

    public SchedulingInformationController(SchedulingInformationService schedulingInformationService) {
        this.schedulingInformationService = schedulingInformationService;
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello");
        return "Hello";
    }

    @GetMapping("/information")
    public SchedulingInformation information() {
        return schedulingInformationService.getAllSchedulingInformation();
    }
}
