package cdp;

import java.util.LinkedList;

import cdp.interfaces.IMatriz;

public class Matriz implements IMatriz {
	private int linhas;
	private int colunas;
	private LinkedList<Elemento> conteudo;
	private Elemento elemento;

	public Matriz(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.conteudo = new LinkedList();
	}

	/**
	 * Método responsável por retornar um valor específico de uma matriz.
	 * 
	 * @param linha
	 * @param coluna
	 * @return valor encontrado
	 */
	public Elemento get(int linha, int coluna) {
		if ((linha < 0 || linha > linhas) && (coluna < 0 || coluna > colunas)) {
			return null;
		}
		Elemento elementoAuxiliar = null;
		boolean elementoEncontrado = false;
		for (int i = 0; i < conteudo.size(); i++) {
			Elemento elementoRetornado = conteudo.get(i);
			if ((elementoRetornado.getValor() != null) && (elementoRetornado.getLinha() == linha)
					&& (elementoRetornado.getColuna() == coluna)) {
				elementoEncontrado = true;
				elementoAuxiliar = elementoRetornado;
			}
		}
		if (elementoEncontrado) {
			return elementoAuxiliar;
		} else {
			return null;
		}
	}

	public void set(int linha, int coluna, Float valor) {
		if (!(linha < 0 || linha > linhas) || !(coluna < 0 || coluna > colunas) && (valor != 0)) {
			Elemento elementoRetornado = this.get(linha, coluna);

			if (elementoRetornado == null) {
				elementoRetornado = new Elemento();
			}
			conteudo.add(new Elemento(linha, coluna, valor));
		}		
		
	}

	@Override
	public MatrizTest soma(MatrizTest matriz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrizTest multiplica(MatrizTest matriz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrizTest multiplica(int valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrizTest transposta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrizTest diagonalPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrizTest diagonalSecundaria() {
		// TODO Auto-generated method stub
		return null;
	}

	public LinkedList<Elemento> getConteudo() {
		return conteudo;
	}

	public void setConteudo(LinkedList<Elemento> conteudo) {
		this.conteudo = conteudo;
	}

}
