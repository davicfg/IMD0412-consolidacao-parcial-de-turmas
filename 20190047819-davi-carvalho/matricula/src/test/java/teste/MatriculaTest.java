package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatriculaTest {

	@Test
	void test(BigDecimal n1, BigDecimal n2, BigDecimal n3, Integer frequencia) {
		Matricula m = new Matricula();
		
		m.registrarNota1(n1);
		m.registrarNota2(n2);
		m.registrarNota3(n3);
		m.registrarFrequencia(frequencia);
		
		m.consolidarParcialmente();
		
		Assertions.assertEquals(StatusAprovacao.APR, m.status());
	}

}
