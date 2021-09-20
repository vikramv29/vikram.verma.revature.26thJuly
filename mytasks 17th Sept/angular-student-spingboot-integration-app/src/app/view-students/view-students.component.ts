import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-view-students',
  templateUrl: './view-students.component.html',
  styleUrls: ['./view-students.component.css']
})
export class ViewStudentsComponent implements OnInit {

  private students: Student[];
  constructor(private service: StudentService) {

   }

  ngOnInit() {
    this.service.getAllStudents().subscribe(res => {
      this.students= res ;
    })
  }

}
