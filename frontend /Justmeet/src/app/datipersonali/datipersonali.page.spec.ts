import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { DatipersonaliPage } from './datipersonali.page';

describe('DatipersonaliPage', () => {
  let component: DatipersonaliPage;
  let fixture: ComponentFixture<DatipersonaliPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DatipersonaliPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(DatipersonaliPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
