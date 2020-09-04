import { Component } from '@angular/core';
import {Location} from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-creaevento',
  templateUrl: './creaevento.page.html',
  styleUrls: ['./creaevento.page.scss'],
})
export class CreaeventoPage {

  constructor(
    private _location: Location,
    private router: Router ,
    ) { }

  backClicked() {
    this._location.back();
  }
  HomeP(){
    this.router.navigate(['homep'])
  }
}
