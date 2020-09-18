import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DatipersonaliPageRoutingModule } from './datipersonali-routing.module';

import { DatipersonaliPage } from './datipersonali.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DatipersonaliPageRoutingModule
  ],
  declarations: [DatipersonaliPage]
})
export class DatipersonaliPageModule {}
