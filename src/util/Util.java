package util;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import cdp.Complexo;

public class Util {

	/**
     * Este método e responsável por importar um arquivo de um diretório e
     * passar cada linha para uma lista de String.
     *
     * @param file - Arquivo com o nome e caminho
     * @return listaImportada - Lista com as linhas do arquivo
     * @throws java.io.IOException
     */
    public List<String> importar(String caminho) throws IOException {
        List<String> listaImportada = new ArrayList<String>();

        Path path = Paths.get(caminho);

        try (Scanner scanner = new Scanner(path, "Utf-8")) {            
            while (scanner.hasNextLine()) {
                listaImportada.add(scanner.nextLine());
            }
        } 

        return listaImportada;
    }
    
    /**
     * Método responsável por ler uma lista generica de objetos e imprimir no
     * console.
     *
     * @param listaObjeto
     */
    public void imprime(Collection<?> listaObjeto) {

        for (Object obj : listaObjeto) {
            System.out.println(obj.toString());
        }
    }
    
    /**
     * Método responsável por ler uma string e criar um objeto Complexo.
     * @param numeroComplexo - String com o número complexo.
     * @return 
     * */
	public Complexo stringParaComplexo(String numeroComplexo){
		
		return new Complexo();
	}
    
}
