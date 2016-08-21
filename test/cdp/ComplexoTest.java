package cdp;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComplexoTest {

	private Complexo numeroComplexo1;
	private Complexo numeroComplexo2;	

	@Before
	public void setup() throws IOException {
		this.numeroComplexo1 = new Complexo(2, 3);
		this.numeroComplexo2 = new Complexo(4, 5);		
	}

	@Test
	public void testMultiplica() {
		Complexo resultado = numeroComplexo1.multiplica(numeroComplexo2);
		Assert.assertEquals(-7, resultado.getR(), 0);
		Assert.assertEquals(22, resultado.getI(), 0);
	}

	@Test
	public void testSoma() {
		Complexo resultado = numeroComplexo1.soma(numeroComplexo2);
		Assert.assertEquals(6, resultado.getR(), 0);
		Assert.assertEquals(8, resultado.getI(), 0);
	}
	
}
