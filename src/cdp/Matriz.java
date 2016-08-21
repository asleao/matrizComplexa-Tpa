package cdp;
import java.util.LinkedList;


public class Matriz {
	private int linhas;
	private int colunas;
	private LinkedList<Elemento> conteudo;
	private Elemento elemento;
	
	public Matriz(int linhas, int colunas){
		this.linhas = linhas;
		this.colunas = colunas;
		this.conteudo = new LinkedList();
	}
	
	public Float get(int linha, int coluna){
		if ((linha < 0 || linha >= linhas) || (coluna < 0 || coluna >= colunas)){
			return null;
		}
		
		return new Float(0.0);
	}
	
}
