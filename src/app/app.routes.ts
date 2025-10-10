import { Routes } from '@angular/router';
import { Contador } from './contador/contador/contador';
import { Matatopos } from './matatopos/matatopos';
import { Carrera } from './carrera/carrera';
import { EyeCandy } from './eye-candy/eye-candy';
import { ListaPersonajes } from './lista-personajes/lista-personajes';

export const routes: Routes = [
    {path:'contador', component: Contador},
    {path: 'matatopos', component: Matatopos}, 
    {path: 'carrera', component:Carrera},
    {path: 'eye-cady', component: EyeCandy},
    {path: 'listaPersonajes', component: ListaPersonajes},
    
];
