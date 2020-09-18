import { Component} from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-singup',
  templateUrl: './singup.page.html',
  styleUrls: ['./singup.page.scss'],
})
export class SingupPage {

  constructor( private router:Router) { }

  HomeP() {
    this.router.navigate(['homep'])
  }

}
