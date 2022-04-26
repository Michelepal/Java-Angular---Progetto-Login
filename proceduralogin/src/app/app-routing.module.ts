import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListausersComponent } from './features/listausers/listausers.component';
import { LoginComponent } from './features/login/login.component';

const routes: Routes = [
  {path:'', component: LoginComponent},
  {path:'login', component: LoginComponent},
  {path:'lista', component: ListausersComponent},
  {path:'**', redirectTo:''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
