package com.concytec.bibliotecaapp.service;

import java.util.Set;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.Categoria;
import com.concytec.bibliotecaapp.domain.Prestamo;
import com.concytec.bibliotecaapp.domain.Recurso;
import com.concytec.bibliotecaapp.repository.InMemoryRecursoDao;
import com.concytec.bibliotecaapp.repository.RecursoDao;

public class NewRecurso {
	private RecursoDao recursoDao;

	public void insertRecurso( Categoria categoria, String titRec, String editRec,
			Integer anioEdicRec, String estRec, Set<Autor> autors){
		
		Recurso nuevoRecurso= new Recurso();
		nuevoRecurso.setCategoria(categoria);
		nuevoRecurso.setTitRec(titRec);
		nuevoRecurso.setEditRec(editRec);
		nuevoRecurso.setAnioEdicRec(anioEdicRec);
		nuevoRecurso.setEstRec(estRec);
		nuevoRecurso.getAutors().addAll(autors);
		Autor nuevoAutor= new Autor();
		nuevoAutor.getRecursos().add(nuevoRecurso);
		
		System.out.println("insertar  nuevo recurso: " + nuevoRecurso.getIdeRec() + " " + nuevoRecurso.getTitRec());
		recursoDao = new InMemoryRecursoDao();
		recursoDao.add(nuevoRecurso);
		
		
	}

}
