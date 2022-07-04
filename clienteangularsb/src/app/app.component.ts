import { Component, OnInit } from '@angular/core';
import { CursoService } from './curso.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  [x: string]: any;
  cursos: any[] = [];
  nuevoCurso = {
    titulo: ''
  };
  constructor(private cursoService: CursoService) {}

  ngOnInit(): void {
    this.load();
  }
  load() {
    this.cursoService
      .getAll()
      .subscribe((data: any) => (this.cursos = data._embedded.cursos));
  }
  crear() {
    this.cursoService.create(this.nuevoCurso).subscribe(() => {
      this.load();
      this.nuevoCurso={
        titulo: ""
      };
    });
  }
}
