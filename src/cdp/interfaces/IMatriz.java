package cdp.interfaces;

import cdp.Matriz;

public interface IMatriz {
	public Matriz soma(Matriz matriz);
	public Matriz multiplica(Matriz matriz);
	public Matriz multiplica(int valor);
	public Matriz transposta();
	public Matriz diagonalPrincipal();
	public Matriz diagonalSecundaria();	
}
