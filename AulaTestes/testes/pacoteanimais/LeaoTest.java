package pacoteanimais;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pacoteanimais.Leao;

class LeaoTest {
	private Leao mufasa;
	
	@BeforeEach
	void setUp() throws Exception {
		mufasa = new Leao("Mufasa", 12, 200);
	}

	@Test
	void testRugido() {
		//Expected, Actual
		assertEquals("RRUUAAAUU", mufasa.ruge());
	}
	
	@Test 
	void testCriaLeaoComEspacoNoNome() {
		try {
			mufasa = new Leao("    ",12,250);
		} catch(IllegalArgumentException iae) {
			assertEquals("Nome nulo para o leao.", iae.getMessage());
		}	
	}
	@Test 
	void testCriaLeaoNomeNulo() {
		try {
			mufasa = new Leao(null,12,250);
		} catch(IllegalArgumentException iae) {
			assertEquals("Nome nulo para o leao.", iae.getMessage());
		}	
	}
	
	@Test 
	void testCriaLeaoExcepetion() {
		//Testa se lança a exception requerida na spec
		assertThrows(IllegalArgumentException.class, () -> new Leao(null, 11, 200));
		
	}

}
