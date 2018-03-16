import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  
  items: MenuItem[];

  constructor() { }

  ngOnInit() {
    this.items = [
      {label: 'Book', icon: 'fa-book', routerLink: ['book']},
      {label: 'Author', icon: 'fa-user', routerLink: ['author']},
      {label: 'Category', icon: 'fa-book', routerLink: ['category']},
    ];
  }

}
