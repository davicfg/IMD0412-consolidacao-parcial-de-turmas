package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class MatriculaTest {

	@ParameterizedTest
	@CsvFileSource
	void test(BigDecimal n1, BigDecimal n2, BigDecimal n3, Integer frequencia, String status) {
		Matricula m = new Matricula();
		
		m.registrarNota1(n1);
		m.registrarNota2(n2);
		m.registrarNota3(n3);
		m.registrarFrequencia(frequencia);
		
		m.consolidarParcialmente();
		
		Assertions.assertEquals(status, m.status());
	}

}
