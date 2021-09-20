import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private url: string;
  constructor(private http: HttpClient) {
    this.url= "http://localhost:9100/student" ;
   }
   public addStudent(student: Student): Observable<Student>{
     return this.http.post<Student>(this.url, student) ;
   }
   public updateStudent(student: Student): Observable<Student>{
    return this.http.post<Student>(this.url, student) ;
  }
  public deleteStudent(id:number): Observable<any> {
   return this.http.delete(this.url+"/{id}") ;
  }
  public getAllStudents(): Observable<Student[]>{
    return this.http.get<Student[]>(this.url+ "s") ;
  }
  public getStudentById(id: number): Observable<Student> {
    return this.http.get<Student>(this.url + "/" + id);
  }
}
