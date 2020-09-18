import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DatipersonaliPage } from './datipersonali.page';

const routes: Routes = [
  {
    path: '',
    component: DatipersonaliPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DatipersonaliPageRoutingModule {}
