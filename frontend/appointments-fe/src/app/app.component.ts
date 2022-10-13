import { Appointment } from './appointment.model';
import { AppointmentsService } from './appointments.service';

import { Component, OnInit } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { AppointmentWithTimeSlot } from './appointmentWithTimeSlot.model';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  // potentialAppointmentMatrix:Appointment[][] = [];
potentialAppointmentsFullStructure:AppointmentWithTimeSlot[] = [];
currentDaysOfWeek: any;
numberOfRowsPerSlot: number = 0;
timeSlots:any;
  constructor(private appointmentsService: AppointmentsService){

  }
  ngOnInit(): void {
    console.log("init")
    this.appointmentsService.schedulingInformation().subscribe((data: any) => {
      this.currentDaysOfWeek = data.currentDaysOfWeek;
      this.timeSlots = data.timeSlots;

      this.potentialAppointmentsFullStructure = this.initFullStructure(data, this.initMatrixForATable(data));
      this.numberOfRowsPerSlot = data.numberOfRowsPerSlot;
      console.log('potentialAppointmentsFullStructure: ', this.potentialAppointmentsFullStructure);
    });
  }

  title = 'appointments-fe';

  initMatrixForATable(data:any){
    let potentialAppointmentMatrix:Appointment[][] = [];

    for(let k = 0; k < data.numberOfRowsPerSlot;k++){
      potentialAppointmentMatrix[k]=[];
      console.log('in for k')
      let count = 0;
      for(let i = 0;i<data.currentDaysOfWeek.length;i++){
        console.log('in for i')

        count++;
        for(let j = 0;j<data.numberOfRowsPerSlot;j++){
          console.log('in for j')

          let appointment = new Appointment();
          appointment.index = count;
          potentialAppointmentMatrix[k].push(appointment);
          count++;
        }
      }
    }
    return potentialAppointmentMatrix;
  }

  initFullStructure(data:any, potentialAppointmentMatrix:any){
    let potentialAppointmentsFullStructure:AppointmentWithTimeSlot[] = [];

    for(let i=0; i < data.timeSlots.length;i++){
      let appointmentWithTimeSlot = new AppointmentWithTimeSlot();
      appointmentWithTimeSlot.appointmentMatrix=potentialAppointmentMatrix;
      appointmentWithTimeSlot.timeSlot=data.timeSlots[i].start + '-' + data.timeSlots[i].end
      potentialAppointmentsFullStructure.push(appointmentWithTimeSlot)
    }
    return potentialAppointmentsFullStructure;
  }

  getAppointments(timeSlot:any, dayIndex:any){
    console.log("timeslot: ", timeSlot)
    console.log("dayIndex: ", dayIndex)

  }
  isFirstTimeSlot(timeSlot:any){
    return timeSlot.start == 8;
  }
}
