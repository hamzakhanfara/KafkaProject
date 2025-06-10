import { Component } from '@angular/core';
import { IncidentList } from './incidentlist/incidentlist';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatListModule } from '@angular/material/list';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [IncidentList, MatButtonModule, MatCardModule,
    MatListModule,],
  templateUrl: './app.html',
  styleUrl: './app.scss'
})
export class App {
  protected title = 'incident-viewer';
}
