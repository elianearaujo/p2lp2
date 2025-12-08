package pacoteanimais;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pacoteanimais.Marreco;

class MarrecoTeste {
	
	private Marreco lu;

	@BeforeEach
	void setUp() throws Exception {
		
		lu = new Marreco("Lulu", 5, 3);
	}

	@Test
	void testGalinhaFala() {
		assertEquals("có có", lu.fala());
	}
	
	@Test 
	void testEggs() {		
		assertThrows(IllegalArgumentException.class, ()-> { lu.setEggsday(-1); });
	}
	@Test 
	void testEggsOutro() {
		
		try {
			lu.setEggsday(0);
			fail();
			
		} catch(Exception e) {
			assertEquals("valor invalido", e.getMessage());
		}
		
	}

}
