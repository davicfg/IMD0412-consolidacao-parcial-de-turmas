package teste;

public class Triangulo {

	private final int lado1;

	private final int lado2;

	private final int lado3;

	public Triangulo(final int l1, final int l2, final int l3) {
		if (l1 < 0 || l2 < 0 || l3 < 0) {
			throw new IllegalStateException("Valor do lado não pode ser negativo.");
		}
		
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
	}

	public TipoTriangulo definirTipo() {
		if (lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2) {
			return TipoTriangulo.NAO_E_TRIANGULO;
		} else if (lado1 == lado2 && lado2 == lado3) {
			return TipoTriangulo.EQUILATERO;
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return TipoTriangulo.ISOCELES;
		} else {
			return TipoTriangulo.ESCALENO;
		}
	}

}
