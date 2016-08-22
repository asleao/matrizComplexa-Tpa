package cdp;

public class Elemento {
	private int linha;
	private int coluna;
	private Float valor;

	public Elemento(int linha, int coluna, Float valor) {
		this.linha = linha;
		this.coluna = coluna;
		this.valor = valor;
	}

	public Elemento() {

	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

}
