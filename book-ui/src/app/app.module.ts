import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { TabMenuModule } from 'primeng/primeng';

import { AppComponent } from './app.component';

import { NavbarComponent } from './navbar/navbar.component';
import { BookRegisterComponent } from './book/book-register/book-register.component';
import { AuthorRegisterComponent } from './author/author-register/author-register.component';
import { CategoryRegisterComponent } from './category/category-register/category-register.component';

import { AppRoutingModule } from './app.routing.module';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    
    BookRegisterComponent,
    AuthorRegisterComponent,
    CategoryRegisterComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,

    TabMenuModule,

    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
