import { Component, OnInit } from '@angular/core';
import { FichaPersonajes } from '../ficha-personajes/ficha-personajes';


@Component({
  selector: 'app-lista-personajes',
  imports: [FichaPersonajes],
  templateUrl: './lista-personajes.html',
  styleUrl: './lista-personajes.css'
})
export class ListaPersonajes implements OnInit {

 lista:string[]=["jefe", "perfilador", "criminologo"]; 
    
       personaje: personaje[]=[]; 

    

       ngOnInit(): void {
         
            
       }
}


class personaje{
    nombre!: string; 
    imagen!: string; 
}
