import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppointmentsService {

constructor(private http: HttpClient) { }

url = 'http://localhost:8080/';

httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'text/plain',
  })
};
hello() {
  return this.http.get(this.url + 'hello', this.httpOptions);
}

}
