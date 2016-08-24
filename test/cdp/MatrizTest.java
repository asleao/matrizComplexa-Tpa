package cdp;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import util.Util;

public class MatrizTest {

	private Matriz matriz;	
	
	@Before
	public void setUp() throws Exception {
		matriz = new Matriz(3, 3);
	}
	
	/**
	 * Testa a inserção de um elemento qualquer em um objeto Matriz.
	 */
	@Test
	public void testInserirElementoMatriz() {
		matriz.set(1, 3, new Float(5));				
		matriz.set(1, 2, new Float(3));
		Util util = new Util();
		util.imprime(matriz.getConteudo());
		Assert.assertEquals(1, matriz.get(1, 2).getLinha());
		Assert.assertEquals(3, matriz.get(1, 2).getColuna());
		Assert.assertEquals(new Float(3), matriz.get(1, 3).getValor());
		Assert.assertEquals(1, matriz.get(1, 3).getLinha());
		Assert.assertEquals(2, matriz.get(1, 3).getColuna());
		Assert.assertEquals(new Float(5), matriz.get(1, 2).getValor());
		

		
	}
	
	/**
	 * Testa a busca de um elemento no objeto Matriz.
	 */
	@Test
	public void testBuscarElementoMatriz(){
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				matriz.set(i, j, new Float(i));				
			}
		}
		
		Util util = new Util();
//		util.imprime(matriz.getConteudo());
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
//				System.out.println(i);
				Assert.assertEquals(new Float(i),matriz.get(i, j).getValor());
			}
		}
	}

}
