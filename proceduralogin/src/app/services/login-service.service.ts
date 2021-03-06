import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})

export class LoginService {
  logged: boolean = false;

  constructor(private http: HttpClient, private router: Router) { 
  }

  login() {
    this.logged = true;
    this.router.navigateByUrl('/lista'); 

  }

  islogged() {
    return this.logged;
  }

}
