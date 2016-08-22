package cdp;

import util.Util;

public class Complexo {
	private float r;
	private float i;
	
	public Complexo(float r, float i) {		
		this.r = r;
		this.i = i;
	}
	
	public Complexo(String numeroComplexo) {
		//Processar a string de trás para frente. Pode utilizar 
		// o split.
	}
	
	public Complexo(){		
		
	}
	
	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float getI() {
		return i;
	}

	public void setI(float i) {
		this.i = i;
	}

	/**
     * Método responsável pela multiplicação de 2 números complexos.
     * @param numero - Objeto Complexo.
     * @return resultado - contém a multiplicação do objeto Complexo com o objeto passado por parametro.
     * */
	public Complexo multiplica(Complexo numero){
		Complexo resultado = new Complexo(((this.r*numero.getR())-(this.i*numero.i)),((this.r*numero.getI())+(this.i*numero.getR())));
		return resultado;
	}
	
	/**
     * Método responsável pela soma de 2 números complexos.
     * @param numero - Objeto Complexo.
     * @return resultado - contém a soma do objeto Complexo com o objeto passado por parametro.
     * */
	public Complexo soma(Complexo numero){
		Complexo resultado = new Complexo((this.r + numero.getR()),(this.i+numero.getI()));
		return resultado;
	}	
	
	/**
     * Método responsável por ler uma string e criar um objeto Complexo.
     * @param numeroComplexo - String com o número complexo.
     * @return 
     * */
	public Complexo stringParaComplexo(String numeroComplexo){
		Util util = new Util();
		numeroComplexo = util.stringReversa(numeroComplexo);

		return new Complexo();
	}
	@Override
	public String toString() {
		return "(r=" + r + ", i=" + i + "i )";
	}
	
	
}
