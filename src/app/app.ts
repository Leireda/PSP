import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Contador } from './contador/contador/contador';
import { Menu } from './menu/menu';
import { Matatopos } from './matatopos/matatopos';
import { Navbar } from './navbar/navbar';









@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Contador, Menu, Matatopos, Navbar],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Introduccion');
}
