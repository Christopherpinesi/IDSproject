import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'singup',
    loadChildren: () => import('./singup/singup.module').then( m => m.SingupPageModule)
  },
  {
    path: 'homep',
    loadChildren: () => import('./homep/homep.module').then( m => m.HomepPageModule)
  },
  {
    path: 'datipersonali',
    loadChildren: () => import('./datipersonali/datipersonali.module').then( m => m.DatipersonaliPageModule)
  },
  {
    path: 'creaevento',
    loadChildren: () => import('./creaevento/creaevento.module').then( m => m.CreaeventoPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
