package pacoteanimais;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GalinhaTeste {
	
	private Galinha fafa;

	@BeforeEach
	void setUp() throws Exception {
		fafa = new Galinha("Fatima", 5, 2);
	}

	@Test
	void testFala() {
		//(expected, obtained)
		assertEquals("cocoricó", fafa.fala());
	}
	@Test
	void testSetProducaoException() {
		assertThrows(IllegalArgumentException.class, ()-> fafa.setProducao(-2));
	} 
	
	@Test
	void testSetProducaoExceptionMessage() {
		try {
			fafa.setProducao(-2);
			fail();
		} catch (IllegalArgumentException iae) {
			assertEquals("valor inválido", iae.getMessage());
		}
	}

}
