import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CursoService {

  constructor(
    private http:HttpClient
  ) { }
getAll(){
  return this.http.get('http://localhost:8080/cursos/');
}
create(data:any){
  return this.http.post('http://localhost:8080/cursos/',data);
}

}
