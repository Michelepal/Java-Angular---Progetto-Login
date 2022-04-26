import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListausersComponent } from './features/listausers/listausers.component';

const routes: Routes = [
  {path:'lista', component: ListausersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
