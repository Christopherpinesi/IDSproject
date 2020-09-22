import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Observable } from 'rxjs/internal/Observable';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-board-moderator',
  templateUrl: './board-moderator.component.html',
  styleUrls: ['./board-moderator.component.css']
})
export class BoardModeratorComponent implements OnInit {

  events: Observable<Event[]>;
  // public formID = this.todayForm.controls['ID'].value

  content: any = [];
  update: boolean = true;

  constructor(
    private userService: UserService,
    ) { }

  ngOnInit() {
    this.userService.getModeratorBoard().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    )
  }

  putButton(id: number) {
    this.userService.putModeratorBoard(id, this.update).subscribe(
      data => {
        console.log(id)
        console.log(data)
      }
    );
  }
  delButton(id: number) {
    this.userService.deleteModeratorBoard(id).subscribe(
      data => {
        console.log(id)
        console.log(data)
      }
    );
  }

}
