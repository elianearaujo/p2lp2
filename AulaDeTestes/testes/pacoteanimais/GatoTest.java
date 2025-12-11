package pacoteanimais;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pacoteanimais.Gato;

class GatoTest {
	
	private Gato chico;

	@BeforeEach
	void setUp() throws Exception {
		chico = new Gato("Chico", 3, "branco e amarelo");

	}

	@Test 
	void testConstroiGato() {
		
		Gato gatoNulo; 
        assertThrows(IllegalArgumentException.class, () -> new Gato("", 3, "preto"));
//        try {
//        	gatoNulo = new Gato("", 3, "preto");
//        } catch(IllegalArgumentException iae) {
//        	assertEquals("Nome nulo para o gato!", iae.getMessage());	
//        }
//        

	}
	
	@Test
	void testMia() {
		// Expected, Actual, Message
		assertEquals("miau", chico.mia(), "Deu Zebra");
		
	}
	
	@Test
	void testGetIdade() {
		assertEquals(3, chico.getIdade());
		
	}

}
