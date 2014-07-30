package com.concytec.bibliotecaapp.repository;

import java.util.List;
import org.hibernate.SessionFactory;
import com.concytec.bibliotecaapp.domain.Categoria;


public class InMemoryCategoriaDao implements CategoriaDao {

	private SessionFactory sesion;
	
	
	
	public void add(Categoria categoria) {
		this.sesion.getCurrentSession().save(categoria);		
	}

	
	public void edit(Categoria categoria) {
		this.sesion.getCurrentSession().update(categoria);		
	}

	
	public void delete(int codCat) {
		Categoria categoriaDell = (Categoria)this.sesion.getCurrentSession().get(Categoria.class,codCat);
		if(categoriaDell != null)
		{
			this.sesion.getCurrentSession().delete(codCat);
		}		
	}

	
	public Categoria getCategoria(int codCat) {
		return (Categoria)this.sesion.getCurrentSession().get(Categoria.class, codCat);
	}

	
	public List<Categoria> getAllCategorias() {
		@SuppressWarnings("unchecked")
		List<Categoria> listCategorias = (List<Categoria>)this.sesion.getCurrentSession().createQuery("from categoria").list();
		return listCategorias;
	}

}
