package com.concytec.bibliotecaapp.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class TipoUsuarioTest {
	private  static TipoUsuario tipoUsuario;

    @BeforeClass
    public void setUp() throws Exception {
        tipoUsuario = new TipoUsuario();
    }

	@Test
	public void testSetAndGetTipoUsuario() {
				
		String testnomTipUsu="Administrador";
		assertNull(tipoUsuario.getNomTipUsu());
		tipoUsuario.setNomTipUsu(testnomTipUsu);
		assertEquals(testnomTipUsu, tipoUsuario.getNomTipUsu());
	}

}
