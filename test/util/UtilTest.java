package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UtilTest {
	
	private Util util;
	private List<String> listaImportada;
	@Before
	public void setUp() throws Exception {
		this.util = new Util();
		this.listaImportada = new ArrayList();
	}

	@Test
	public void testImportar() {
		try {
			listaImportada = this.util.importar("/media/Dados/Dropbox/IFES/Materias/TPA/MatrizComplexas/A.txt");			
			Assert.assertEquals(3, listaImportada.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
