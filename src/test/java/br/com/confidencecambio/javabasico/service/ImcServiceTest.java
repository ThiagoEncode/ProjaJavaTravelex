package br.com.confidencecambio.javabasico.service;

import org.junit.Before;
import org.junit.Test;

import br.com.confidencecambio.javabasico.model.Gerente;
import static org.junit.Assert.assertEquals;

public class ImcServiceTest {

	private ImcService service;
	Gerente gerente;

	@Before
	public void init() {
		service = new ImcService();

	}

	@Test
	public void calcImc() {
		var nome = "IMC: 25,71";
		String valorValido = service.calcImc(70, 1.65);
		assertEquals(nome, valorValido);
	}

	@Test(expected = Exception.class)
	public void nomeNulo() throws Exception {

		Gerente gerente = new Gerente("");
	
	}
	
	@Test
	public void firstNameTest() throws Exception {
		Gerente gerente = new Gerente("José Silva");
		gerente.getFirstName();
		assertEquals(gerente.getFirstName(), "José");
	}
	
	@Test
	public void lastTest() throws Exception {
		Gerente gerente = new Gerente("José Souza Silva");
		gerente.getFirstName();
		assertEquals(gerente.getLastName(), "Souza Silva");
	}
	
	@Test
	public void lastNameUperCase() throws Exception {
		Gerente gerente = new Gerente("José Souza Silva");
		gerente.getFirstName();
		assertEquals(gerente.getNameUperCase(), "JOSÉ SOUZA SILVA");
	}
	
	@Test
	public void ShorName() throws Exception {
		Gerente gerente = new Gerente("José Souza Silva");
		gerente.getFirstName();
		assertEquals(gerente.getShortName(), "José S. Silva");
	}

}