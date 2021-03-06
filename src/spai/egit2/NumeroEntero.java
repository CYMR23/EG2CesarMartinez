package spai.egit2;

public class NumeroEntero {
	private int valor;

	public NumeroEntero(int valor) {
		this.valor = valor;
	}

	public NumeroEntero() {
		this(0);
	}

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	public void incrementar() {
		this.setValor(this.valor + 1);
	}

	public void doblar() {
		this.setValor(this.valor * 2);
	}

	public void decrementar() {
		this.valor--;
	}

	public boolean isPrimo(NumeroEntero numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero.getValor())) {
			if (numero.getValor() % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

}
