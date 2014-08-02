package com.concytec.bibliotecaapp.repository;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.concytec.bibliotecaapp.domain.Categoria;
import com.concytec.bibliotecaapp.domain.TipoUsuario;
import com.concytec.bibliotecaapp.domain.Usuario;

public class InMemoryUsuarioDao implements UsuarioDao{
	
	private SessionFactory sesion;
	private Session s ;
	private Transaction trans;
	
	public InMemoryUsuarioDao(){
		sesion = HibernateUtil.getSessionFactory();
	}
	
	
	public void add(Usuario usuario) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.save(usuario);
		trans.commit();	
	}

	
	public void edit(Usuario usuario) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.update(usuario);	
		trans.commit();	
	}

	
	public void delete(Usuario usuario) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.delete(usuario);	
		trans.commit();			
	}

	
	public Usuario getUsuario(String docIdeUsu) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		Usuario usuario = (Usuario)s.get(Usuario.class,docIdeUsu);
		trans.commit();		
		return usuario;
	}

	
	public List<Usuario> getAllUsuarios() {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();

		@SuppressWarnings("unchecked")
		List<Usuario> listUsuarios = (List<Usuario>)s.createQuery("from Usuario").list();
		trans.commit();

		return listUsuarios;
	}

	
	public Usuario loginUsuario(String docIdeUsu, String password) {
		Usuario usuarioRpta = null;
		s = sesion.getCurrentSession();
		System.out.println("usuario logeandose");
		trans=s.beginTransaction();
		Query query= s.createQuery("FROM Usuario as u"
								+ " WHERE u.docIdeUsu = '"+docIdeUsu +"' and u.passUsu ='"+ password +"'");
		query.setParameter("docIdeUsu", docIdeUsu);
		query.setParameter("passUsu", password);
		
		List usuario = query.list();
		Iterator lista = usuario.iterator();
        while(lista.hasNext())
        {
            Usuario result = (Usuario) lista.next();        
            usuarioRpta = result;
        }
        
		trans.commit();
		return usuarioRpta;
	}

}
