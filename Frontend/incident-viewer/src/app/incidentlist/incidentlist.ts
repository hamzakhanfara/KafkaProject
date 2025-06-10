import { Component, OnInit } from '@angular/core';
import { Incident } from '../models/incident.model';
import { IncidentService } from '../services/incident';
import { CommonModule } from '@angular/common';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatListModule } from '@angular/material/list';

@Component({
  selector: 'app-incidentlist',
  standalone: true,
  imports: [CommonModule, MatButtonModule,MatCardModule,MatListModule],
  templateUrl: './incidentlist.html',
  styleUrl: './incidentlist.scss'
})
export class IncidentList implements OnInit {
  incidents: Incident[] = [];

  constructor(private incidentService: IncidentService) {}

  ngOnInit(): void {
    this.incidentService.getIncidents().subscribe(data => {
      this.incidents = data;
    });
  }
}