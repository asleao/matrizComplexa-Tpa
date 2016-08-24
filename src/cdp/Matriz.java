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

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public LinkedList<Elemento> getConteudo() {
		return conteudo;
	}

	public void setConteudo(LinkedList<Elemento> conteudo) {
		this.conteudo = conteudo;
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

	public String set(int linha, int coluna, Float valor) {
		if ((!(linha < 0 || linha > linhas) && !(coluna < 0 || coluna > colunas)) && !(valor.equals(new Float(0)))) {
			Elemento elementoRetornado = this.get(linha, coluna);

			if (elementoRetornado == null) {
				elementoRetornado = new Elemento();
			}
			conteudo.add(new Elemento(linha, coluna, valor));
			return "Sucesso";
		} else {
			return null;
		}

	}

	public Matriz soma(Matriz matriz) {
		Matriz matrizResultante = new Matriz(linhas, colunas);
		if ((matriz.getLinhas() == this.linhas) && (matriz.getColunas() == this.colunas)) {
			for (int i = 1; i <= linhas; i++) {
				for (int j = 1; j <= colunas; j++) {
					matrizResultante.set(i, j, (this.get(i, j).getValor() + matriz.get(i, j).getValor()));
				}
			}
		}
		return matrizResultante;
	}

	public Matriz multiplica(Matriz matriz) {
		// TODO Auto-generated method stub
		return null;
	}

	public Matriz multiplica(int valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Matriz transposta() {
		// TODO Auto-generated method stub
		return null;
	}

	public Matriz diagonalPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	public Matriz diagonalSecundaria() {
		// TODO Auto-generated method stub
		return null;
	}

}
