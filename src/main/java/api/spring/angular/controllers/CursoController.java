package api.spring.angular.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import api.spring.angular.models.Curso;
import api.spring.angular.repository.CursoRepositotory;

//@RestController
//public class CursoController {
//	@Autowired
//	private CursoRepositotory repo;
//
//	@GetMapping("/cursos")
//	public List<Curso> listar() {
//
//		return repo.findAll();
//
//	}
//
//}
