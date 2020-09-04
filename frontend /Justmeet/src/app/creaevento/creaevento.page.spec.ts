import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { CreaeventoPage } from './creaevento.page';

describe('CreaeventoPage', () => {
  let component: CreaeventoPage;
  let fixture: ComponentFixture<CreaeventoPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreaeventoPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(CreaeventoPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
