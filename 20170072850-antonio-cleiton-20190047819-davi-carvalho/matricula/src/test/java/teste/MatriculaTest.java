package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


class MatriculaTest {
	@ParameterizedTest(name = "{5}")
	@CsvSource(delimiter = '\t', value = {"0	6.2	6.7	6.5	REPF	REPF1",
			"1	8.0	8.1	8.2	REPF	REPF2",
			"74	4.3	2.0	1.0	REP	REP3",
			"75	7.0	6.0	5.0	APR	APR4",
			"76	5.0	4.4	7.0	REC	REC5",
			"99	2.0	3.0	0.5	REP	REP6",
			"100	5.4	5.5	7.0	APR	APR7",
			"98	0.0	0.0	0.0	REP	REP8",
			"97	0.0	0.1	0.3	REP	REP9",
			"96	3.0	2.0	3.7	REP	REP10",
			"95	2.9	3.5	2.7	REC	REC11",
			"94	2.8	3.7	2.7	REC	REC12",
			"93	9.6	4.8	3.3	REC	REC13",
			"92	6.0	7.0	5.0	APR	APR14",
			"91	4.4	5.4	8.5	APR	APR15",
			"90	9.9	9.9	9.9	APR	APR16",
			"89	10.0	10.0	10.0	APR	APR17",
			"70	0.0	4.7	4.8	REPF	REPF18",
			"78	0.1	9.3	9.9	REC	REC19",
			"90	3.9	7.0	7	REC	REC20",
			"97	4.0	3.0	3	REC	REC21",
			"56	4.1	5.5	10.0	REPF	REPF22",
			"55	9.9	9.1	9.0	REPF	REPF23",
			"95	10.0	55.0	62.0	APR	APR24",
			"44	1.2	0.0	0.0	REP	REP25",
			"90	3.2	0.1	5.5	REP	REP26",
			"90	4.5	3.9	5.9	REC	REC27",
			"85	6.8	4.0	5.5	REC	REC28",
			"95	8.9	4.1	9.8	APR	APR29",
			"80	4.5	9.9	2.6	REC	REC30",
			"55	10.0	10.0	10.0	REPF	REPF31",
			"69	4.3	5.5	0.0	REPF	REPF32",
			"78	10.0	10.0	0.1	REC	REC33",
			"74	7.0	6.4	3.9	REPF	REPF34",
			"73	2.2	3.5	4.0	REPF	REPF35",
			"76	7.7	1.5	9.9	REC	REC36",
			"78	5.2	4.6	10.0	APR	APR37"
})
	void test(Integer frequencia, BigDecimal n1, BigDecimal n2, BigDecimal n3, String status, String nome_teste) {
		Matricula m = new Matricula();
		m.registrarNota1(n1);
		m.registrarNota2(n2);
		m.registrarNota3(n3);
		m.registrarFrequencia(frequencia);
		
		m.consolidarParcialmente();
		
		assertEquals(status, m.status().toString());
	}

}
