package cdp;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import util.Util;

public class MatrizTest {

	private Matriz matriz;
	private Util util;

	@Before
	public void setUp() throws Exception {
		matriz = new Matriz(3, 3);
		util = new Util();
	}

	/**
	 * Testa a inserção de um elemento qualquer em um objeto Matriz.
	 */
	@Test
	public void testInserirElementoMatriz() {
		matriz.set(1, 3, new Float(5));
		matriz.set(1, 2, new Float(3));

		Assert.assertEquals(1, matriz.get(1, 2).getLinha());
		Assert.assertEquals(2, matriz.get(1, 2).getColuna());
		Assert.assertEquals(new Float(3), matriz.get(1, 2).getValor());

		Assert.assertEquals(1, matriz.get(1, 3).getLinha());
		Assert.assertEquals(3, matriz.get(1, 3).getColuna());
		Assert.assertEquals(new Float(5), matriz.get(1, 3).getValor());

	}

	/**
	 * Testa a busca de um elemento no objeto Matriz.
	 */
	@Test
	public void testBuscarElementoMatriz() {
		matriz = alimentaMatriz(3, 3);

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				Assert.assertEquals(i, matriz.get(i, j).getLinha());
				Assert.assertEquals(j, matriz.get(i, j).getColuna());
				Assert.assertEquals(new Float(i), matriz.get(i, j).getValor());
			}
		}
	}

	private Matriz alimentaMatriz(int linhas, int colunas) {
		Matriz objetoMatriz = new Matriz(linhas, colunas);
		for (int i = 1; i <= linhas; i++) {
			for (int j = 1; j <= colunas; j++) {
				objetoMatriz.set(i, j, new Float(i));
			}
		}
		return objetoMatriz;
	}

	/**
	 * Testa se a matriz aceita a inserção de zeros.
	 */

	@Test
	public void testInsercaoZero() {
		matriz.set(1, 1, new Float(0));
		Assert.assertEquals(null, matriz.get(1, 1));
	}

	/**
	 * Testa a soma de matrizes.
	 */
	@Test
	public void testSomaMatriz() {
		Matriz matrizA = alimentaMatriz(3, 3);
		Matriz matrizB = alimentaMatriz(3, 3);
		Matriz matrizSomada = matrizA.soma(matrizB);

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				Assert.assertEquals(new Float(i + i), matrizSomada.get(i, j).getValor());
			}
		}
	}
	
	/**
	 * Testa a multiplicação de todos os elementos de uma matriz por um valor N.
	 */
	@Test
	public void testMultiplicacaoMatrizPorN(){
		Matriz matrizA = alimentaMatriz(3, 3);		
		Matriz matrizMultiplicada = matrizA.multiplica(2);
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				Assert.assertEquals(new Float(i*2), matrizMultiplicada.get(i, j).getValor());
			}
		}
		
	}
	
	/**
	 * Testa a multiplicacao de duas matrizes.
	 */
	
	@Test
	public void testMultiplicacaoMatriz(){
		Matriz matrizA = alimentaMatriz(3, 3);
		Matriz matrizB = alimentaMatriz(3, 3);
		Matriz matrizMultiplicada = matrizA.multiplica(matrizB);
		util.imprime(matrizA.getConteudo());
//		util.imprime(matrizMultiplicada.getConteudo());
		
	}
}
