package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class TrianguloTest {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Antes de todo mundo");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("Após todo mundo");
	}

	@BeforeEach
	public void setUp() {
		System.out.println("Antes de cada método");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("Depois de cada método");
	}

	@ParameterizedTest(name = "{4}")
	@CsvSource(delimiter = '\t', value = {
			"101	101	101	EQUILATERO	o nome do teste\n",
			})
	void testeParametrizadoCasosNormais(int l1, int l2, int l3, TipoTriangulo tipoEsperado, String msg) {
		System.out.println("T1.1");

		Triangulo triangulo = new Triangulo(l1, l2, l3);

		TipoTriangulo tipoRetornado = triangulo.definirTipo();
		
		assertEquals(tipoEsperado, tipoRetornado);
	}
	
	
	@ParameterizedTest
	@MethodSource( "foo" )
	void quandoL1eNegativoDeveLancarExcecao(int l1, int l2, int l3, Class tipoEsperado) {
		System.out.println("T2.1");
		
		Assertions.assertThrows(tipoEsperado, () -> new Triangulo(l1, l2, l3));
	}
	
	static java.util.stream.Stream<Arguments> foo() {		
	    return Stream.of(
	      Arguments.of(10, 10, -10, IllegalStateException.class),
	      Arguments.of(10, -10, 10, RuntimeException.class)
	    );
	}
	

}
