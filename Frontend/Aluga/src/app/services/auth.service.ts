import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private isAuthenticatedUser = false;

  login(username: string, password: string): boolean {
    // Aqui você pode adicionar a lógica para verificar as credenciais
    // Simulando um login
    if (username === 'rafael' && password === '1q2w3e4r') {
      this.isAuthenticatedUser = true;
      return true;
    } else {
      return false;
    }
  }

  logout(): void {
    this.isAuthenticatedUser = false;
  }

  isAuthenticated(): boolean {
    return this.isAuthenticatedUser;
  }
}
