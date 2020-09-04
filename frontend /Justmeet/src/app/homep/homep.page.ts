import { Component } from '@angular/core';
import { MenuController } from '@ionic/angular' ; 
@Component({
  selector: 'app-homep',
  templateUrl: './homep.page.html',
  styleUrls: ['./homep.page.scss'],
})
export class HomepPage {

  constructor( private menu:MenuController ) { }

  openFirst() {
    this.menu.enable(true, 'first');
    this.menu.open('first');
  }
}
