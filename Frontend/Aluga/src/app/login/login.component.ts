import { Component } from '@angular/core';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  constructor(private authService: AuthService) { }

  login() {
    const credentials = { username: this.username, password: this.password };
    this.authService.login(credentials).subscribe(response => {
      console.log('Login bem-sucedido', response);
      // Gerenciar o token de autenticação, se necessário
    }, error => {
      console.error('Erro de login', error);
    });
  }
}
