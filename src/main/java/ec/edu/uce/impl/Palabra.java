package ec.edu.uce.impl;

import ec.edu.uce.interfaz.IExpresion;
import ec.edu.uce.modelo.Contexto;

public class Palabra implements IExpresion {

	private String s;

	public Palabra() {

	}

	public Palabra(String s) {
		this.s = s;
	}

	@Override
	public String interprete(Contexto contexto) {
		// TODO Auto-generated method stub
		return contexto.imprimirEnPalabras(s);
	}

}
