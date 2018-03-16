import { NgModule } from "@angular/core";
import { ModuleWithProviders } from "@angular/core";
import { RouterModule ,Routes } from "@angular/router";

import { BookRegisterComponent } from "./book/book-register/book-register.component";
import { CategoryRegisterComponent } from "./category/category-register/category-register.component";
import { AuthorRegisterComponent } from "./author/author-register/author-register.component";

const appRoutes: Routes = [
  {path: 'book', component: BookRegisterComponent},
  {path: 'author', component: AuthorRegisterComponent},
  {path: 'category', component: CategoryRegisterComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports:[
    RouterModule
  ]
})

export class AppRoutingModule{}