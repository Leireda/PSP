import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FichaPersonajes } from './ficha-personajes';

describe('FichaPersonajes', () => {
  let component: FichaPersonajes;
  let fixture: ComponentFixture<FichaPersonajes>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FichaPersonajes]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FichaPersonajes);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
