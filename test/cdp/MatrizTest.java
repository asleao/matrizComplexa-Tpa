package cdp;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class MatrizTest {

	private Matriz matriz;	
	
	@Before
	public void setUp() throws Exception {
		matriz = new Matriz(3, 3);
	}

	@Test
	public void testGet() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {				
				matriz.set(i, j, new Float(1));
			}			
		}
		System.out.println(matriz.get(2, 1));
	}

	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testSoma() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicaMatriz() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicaInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransposta() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiagonalPrincipal() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiagonalSecundaria() {
		fail("Not yet implemented");
	}

}
