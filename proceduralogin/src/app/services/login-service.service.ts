import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})

export class LoginService {
  logged: boolean = false;

  constructor(http: HttpClient) { 
  }

  login() {
    this.logged = true;
  }

}
