package spai.egit2;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos es igual al
 * producto de medios
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre sí
 * 
 * Reducir varias fracciones a común denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a común
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La división de dos fracciones es otra fracción que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraccion {
	private int numerador;

	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fraccion() {
		this(1, 1);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public double decimal() {
		return (double) numerador / denominador;
	}

	public boolean isPropia(Fraccion fraccion) {
		if (fraccion.denominador > fraccion.numerador)
			return true;
		else
			return false;
	}

	public boolean isImpropia(Fraccion fraccion) {
		if (fraccion.denominador < fraccion.numerador)
			return true;
		else
			return false;
	}

	public boolean isEquivalente(Fraccion fraccion) {
		return (this.getNumerador() * fraccion.getDenominador()) == (this
				.getDenominador() * fraccion.getNumerador());
	}

	public Fraccion menor(Fraccion fraccion1, Fraccion fraccion2) {
		if (fraccion1.decimal() < fraccion2.decimal()) {
			return fraccion1;
		} else
			return fraccion2;
	}

	public Fraccion mayor(Fraccion fraccion1, Fraccion fraccion2) {
		if (fraccion1.decimal() > fraccion2.decimal()) {
			return fraccion1;
		} else
			return fraccion2;
	}

	public Fraccion multiplicar(Fraccion fraccion, Fraccion fraccion2) {
		int multipliedNumerator = fraccion.getNumerador()
				* fraccion2.getNumerador();
		int multipliedDenominator = fraccion.getDenominador()
				* fraccion2.getDenominador();

		return new Fraccion(multipliedNumerator, multipliedDenominator);
	}

}
