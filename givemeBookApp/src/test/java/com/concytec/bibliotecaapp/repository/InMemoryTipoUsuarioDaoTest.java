package com.concytec.bibliotecaapp.repository;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.concytec.bibliotecaapp.service.NewTipoUsuario;

public class InMemoryTipoUsuarioDaoTest {

	private static NewTipoUsuario newTipoUsuario;

    @BeforeClass
    public static void  setUp() throws Exception {
        newTipoUsuario = new NewTipoUsuario();
    }
    
    @Test
	public void testInsertTipoUsuario() {
		String testNewtipoUsuario = "Administrador";
		Integer testNewCodTipUsu = 1;
		newTipoUsuario.insertTipoUsuario(testNewtipoUsuario);
		assertEquals(testNewtipoUsuario, newTipoUsuario.getTipoUsuario(testNewCodTipUsu).getNomTipUsu());
	}
    
    @Test
	public void testEditTipoUsuario() {
		String testNewtipoUsuario = "Docente";
		Integer testNewCodTipUsu = 4;
    	int valor = newTipoUsuario.getTipoUsuario(testNewCodTipUsu).getIdeTipUsu();		
		newTipoUsuario.editTipoUsuario(valor, testNewtipoUsuario);
		assertEquals(testNewtipoUsuario, newTipoUsuario.getTipoUsuario(testNewCodTipUsu).getNomTipUsu());
		
	}
}
