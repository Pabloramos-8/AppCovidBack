package com.example.demo.persistencia.services;

import java.util.Optional;

import com.example.demo.modelo.alumno.Alumno;
import com.example.demo.persistencia.repositories.AlumnoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService extends BaseService<Alumno, String, AlumnoRepository> {
	
	// modo manual que se utiliza cuando los métodos del repository son suficientes.
	public void cambiarNombre(String identificador, String nombre) {
		Optional<Alumno> pOptional = this.repositorio.findById(identificador);
		if (pOptional.isPresent()) {
			Alumno p = pOptional.get();
			p.setNombre(nombre);
			this.repositorio.save(p);
		}
	}

	public Page<Alumno> encontrarPorNombre(String nombre, Pageable p) {
		return this.repositorio.findByName(nombre, p);
	}
	
	public Optional<Alumno> encontrarPorId(String id) {
		return this.repositorio.findById(id);
	}

}
