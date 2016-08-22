package cdp.interfaces;

import cdp.MatrizTest;

public interface IMatriz {
	public MatrizTest soma(MatrizTest matriz);
	public MatrizTest multiplica(MatrizTest matriz);
	public MatrizTest multiplica(int valor);
	public MatrizTest transposta();
	public MatrizTest diagonalPrincipal();
	public MatrizTest diagonalSecundaria();	
}
