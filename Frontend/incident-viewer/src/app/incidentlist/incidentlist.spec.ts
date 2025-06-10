import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Incidentlist } from './incidentlist';

describe('Incidentlist', () => {
  let component: Incidentlist;
  let fixture: ComponentFixture<Incidentlist>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Incidentlist]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Incidentlist);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
