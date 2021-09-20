import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-update-student',
  templateUrl: './update-student.component.html',
  styleUrls: ['./update-student.component.css']
})
export class UpdateStudentComponent implements OnInit {

  id: number;
  student: Student;
  flag: boolean;
  viewFlag: boolean;
  constructor(private service: StudentService, private router: Router) {
    this.student = new Student();
    this.flag = true;
    this.viewFlag = true;
  }
  ngOnInit() {
  }
  getStudentById() {
    this.service.getStudentById(this.id).subscribe(res => {

      this.student = res;
      this.flag = false;
      this.viewFlag = false;
    })
  }

  updateStudent() {
    this.service.updateStudent(this.student).subscribe(res => {
      //this.student = new Student();
      this.router.navigate(["/viewStudents"])
    })
  }

}