import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-delete-student',
  templateUrl: './delete-student.component.html',
  styleUrls: ['./delete-student.component.css']
})
export class DeleteStudentComponent implements OnInit {
  id: number;
  studentList: Student[];
  flag: boolean;
  constructor(private service: StudentService, private router: Router) {
    this.flag = false;
  }

  ngOnInit() {
    this.service.getAllStudents().subscribe(res => {
      this.studentList = res;
      if (this.studentList.length > 0) {
        this.flag = true;
      }
    });

  }

  public deleteStudentById() {
    this.service.deleteStudent(this.id).subscribe(res => {
      this.router.navigate(["/viewStudents"]);
    });

  }
}