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
	/**
	 * Método responsável por setar um valor em uma posição da matriz.
	 * @param linha
	 * @param coluna
	 * @param valor
	 * @return
	 */
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
		Matriz matrizResultante = new Matriz(linhas, colunas);
		if ((matriz.getLinhas() == this.linhas) && (matriz.getColunas() == this.colunas)) {
			for (int linhaMat1 = 1; linhaMat1 <= linhas; linhaMat1++) {
				for (int colunaMat2 = 1; colunaMat2 <= matriz.getColunas(); colunaMat2++) {
					Float valor = new Float(0);
					for (int colunaMat1 = 1; colunaMat1 <= colunas; colunaMat1++) {
						valor += this.get(linhaMat1, colunaMat1).getValor() * matriz.get(colunaMat1, colunaMat2).getValor();
					}					
					matrizResultante.set(linhaMat1, colunaMat2, (valor));
				}
			}
		}
		return matrizResultante;
	}

	public Matriz multiplica(int valor) {
		Matriz matrizResultante = new Matriz(linhas, colunas);
		for (int i = 1; i <= linhas; i++) {
			for (int j = 1; j <= colunas; j++) {
				matrizResultante.set(i, j, (this.get(i, j).getValor() * valor));
			}
		}
		return matrizResultante;
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
