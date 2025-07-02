import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MahiComponent } from './mahi.component';

describe('MahiComponent', () => {
  let component: MahiComponent;
  let fixture: ComponentFixture<MahiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MahiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MahiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
