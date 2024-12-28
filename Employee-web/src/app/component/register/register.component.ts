import {ChangeDetectionStrategy, Component } from '@angular/core';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule} from '@angular/forms';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatDatepickerModule} from '@angular/material/datepicker';

interface Food {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'register',
  imports: [MatCheckboxModule, FormsModule, MatFormFieldModule, MatSelectModule, MatInputModule, MatDatepickerModule],
  changeDetection: ChangeDetectionStrategy.OnPush,
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {
  selectedValue = '';  
  foods = [
    { value: 'pizza', viewValue: 'Pizza' },
    { value: 'burger', viewValue: 'Burger' },
    { value: 'pasta', viewValue: 'Pasta' }
  ];

  onFoodChange(event: any): void {
    this.selectedValue = event.value;  
    console.log('Selected food:', this.selectedValue);
  }

}
