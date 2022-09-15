import { AppointmentsService } from './appointments.service';
import { Component, OnInit } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  constructor(private appointmentsService: AppointmentsService){

  }
  ngOnInit(): void {
    this.appointmentsService.hello().subscribe((data: any) => console.log(data));
  }

  title = 'appointments-fe';


}
