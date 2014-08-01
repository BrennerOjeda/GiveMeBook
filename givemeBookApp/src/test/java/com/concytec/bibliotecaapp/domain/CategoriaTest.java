package com.concytec.bibliotecaapp.domain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CategoriaTest {
	private static Categoria categoria;

	@BeforeClass
	public static void setUp() throws Exception {
		categoria = new Categoria();
	}

	@Test
	public void testSetAndGetNomCat() {
		String testnomCat="Matematicas";
		assertNull(categoria.getNomCat());
		categoria.setNomCat(testnomCat);
		assertEquals(testnomCat, categoria.getNomCat());
	}

	@Test
	public void testSetAndGetDesCat() {
		String testDesCat="Teoria de Numeros";
		assertNull(categoria.getDesCat());
		categoria.setDesCat(testDesCat);
		assertEquals(testDesCat, categoria.getDesCat());
	}
}
