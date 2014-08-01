package com.concytec.bibliotecaapp.domain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AutorTest {

private static Autor autor;
	
	@BeforeClass
	public static void setUp() throws Exception {
		autor = new Autor();
	}

	@Test
	public void testSetAndGetCodAut() {
		Integer  testCodAut = 5;
		assertNull(autor.getCodAut());
		autor.setCodAut(testCodAut);
		assertEquals(testCodAut, autor.getCodAut());
		
	}

	@Test
	public void testSetAndGetNomAut() {
		String testnomAut="Dionisio";
		assertNull(autor.getNomAut());
		autor.setNomAut(testnomAut);
		assertEquals(testnomAut, autor.getNomAut());
	}

	@Test
	public void testSetAndGetApeAut() {
		String testApeAut="Valencia";
		assertNull(autor.getApeAut());
		autor.setApeAut(testApeAut);
		assertEquals(testApeAut, autor.getApeAut());
	}

}
