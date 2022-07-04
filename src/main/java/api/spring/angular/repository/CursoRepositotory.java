package api.spring.angular.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import api.spring.angular.models.Curso;
@CrossOrigin
@RepositoryRestResource(path = "cursos", collectionResourceRel = "cursos")
public interface CursoRepositotory extends JpaRepository<Curso, Integer>{
	
	@RestResource(path = "por-titulo")
	List<Curso> findByTitulo(String t);
}
//agregando esas anotaciones no tengo que implementar clase contraladora