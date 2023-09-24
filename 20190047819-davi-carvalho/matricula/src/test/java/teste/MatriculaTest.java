package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class MatriculaTest {

	@ParameterizedTest(name = "{5}")
	@CsvSource(delimiter = '\t', value = {"97	7.00	7.00	7.00	APR	APR1",
			"100	9.00	2.90	9.50	APR	APR2",
			"74	6.00	6.00	6.00	REPF	REPF3",
			"0	9.00	3.40	2.00	REPF	REPF4",
			"93	5.0	5.0	5.0	APRN	APRN5",
			"78	4.9	4.9	4.9	REC	REC6",
			"90	2.90	1.00	1.00	REP	REP7",
			"88	3.10	9.00	9.00	APR	APR8",
			"78	10.00	3.40	3.40	APRN	APRN9",
			"79	3.00	9.00	9.00	APR	APR10",
			"76	8.00	6.00	4.00	APRN	APRN11",
			"75	7.20	3.90	3.30	REC	REC12",
			"78	0.00	5.90	9.30	REC	REC13",
			"77	5.60	0.00	9.30	REC	REC14",
			"79	9.30	5.60	0.00	REC	REC15",
			"81	0.00	0.00	0.00	REP	REP16",
			"82	3.60	10.00	8.00	APR	APR17",
			"83	3.70	3.00	10.00	APRN	APRN18",
			"84	6.30	2.90	8.20	REC	REC19",
			"85	8.20	6.30	2.90	REC	REC20",
			"86	4.00	4.00	3.00	REP	REP21",
			"87	5.00	3.00	5.00	REP	REP22",
			"88	7.00	3.10	6.50	APRN	APRN23",
			"89	7.30	6.60	3.10	APRN	APRN24",
			"92	10.00	10.00	10.00	APR	APR25",
			"93	2.90	2.90	2.90	REP	REP26",
			"94	3.00	3.00	3.00	REP	REP27",
			"95	4.20	3.10	2.00	REC	REC28",
			"97	5.10	6.20	4.00	APRN	APRN29",
			"96	6.90	6.90	6.90	APRN	APRN30",
			"97	7.10	7.10	7.10	APR	APR31"
})
	void test(Integer frequencia, BigDecimal n1, BigDecimal n2, BigDecimal n3, String status, String nome_teste) {
		Matricula m = new Matricula();
		System.out.println(nome_teste);
		m.registrarNota1(n1);
		m.registrarNota2(n2);
		m.registrarNota3(n3);
		m.registrarFrequencia(frequencia);
		
		m.consolidarParcialmente();
		
		assertEquals(status, m.status().toString());
	}

}
