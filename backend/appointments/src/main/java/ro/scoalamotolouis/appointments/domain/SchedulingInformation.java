package ro.scoalamotolouis.appointments.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SchedulingInformation {
    private List<TimeSlot> timeSlots;

    private List<LocalDate> currentDaysOfWeek;

    private int numberOfRowsPerSlot;
}
