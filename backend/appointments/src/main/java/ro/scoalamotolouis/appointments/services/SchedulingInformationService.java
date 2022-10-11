package ro.scoalamotolouis.appointments.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ro.scoalamotolouis.appointments.domain.SchedulingInformation;
import ro.scoalamotolouis.appointments.domain.TimeSlot;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class SchedulingInformationService {

    @Value("${start.time}")
    private int startTime;

    @Value("${end.time}")
    private int endTime;

    @Value("${duration}")
    private int duration;

    @Value("${number.of.rows}")
    private int nbOfRows;

    private List<TimeSlot> timeSlots() {
        List<TimeSlot> timeSlots = new ArrayList<>();
        for (int current = startTime; current < endTime; current += duration) {
            timeSlots.add(new TimeSlot(current, current + duration));
        }
        return timeSlots;
    }

    private List<LocalDate> currentWeekDays(){
        return Arrays.stream(DayOfWeek.values()).map(LocalDate.now()::with).collect(toList());

    }

    public SchedulingInformation getAllSchedulingInformation(){
        return new SchedulingInformation(timeSlots(), currentWeekDays(), nbOfRows);
    }
}
