import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BhartiComponent } from './bharti.component';

describe('BhartiComponent', () => {
  let component: BhartiComponent;
  let fixture: ComponentFixture<BhartiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BhartiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BhartiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
