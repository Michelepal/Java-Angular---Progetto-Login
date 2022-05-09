import { HttpClient } from '@angular/common/http';
import { Component} from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Login } from 'src/app/model/login';
import { LoginService } from 'src/app/services/login-service.service';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  Login!: Login; 
  error: string | null | undefined;

  constructor(private http: HttpClient, private login: LoginService) {}

  /* @Output() submitEM = new EventEmitter(); */
  form: FormGroup = new FormGroup({
    username: new FormControl(''),
    password: new FormControl(''),
  });

  submit() {
    if (this.form.valid) {
      /* this.submitEM.emit(this.form.value); */
      this.Login = this.form.value;
      console.log(this.Login);
      this.http.post<Login>("http://localhost:8080/login/entra", this.Login).subscribe((data: Login) => {
        this.Login = data;
        this.login.login();
      }, error => console.log(error));
    }
  }
 
}
