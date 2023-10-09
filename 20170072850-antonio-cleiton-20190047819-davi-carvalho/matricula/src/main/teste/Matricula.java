package teste;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Matricula {
	private Turma turma;

	private Aluno aluno;

	private BigDecimal nota1;

	private BigDecimal nota2;

	private BigDecimal nota3;
	
	private Integer frequencia;

	private StatusAprovacao status;
	
	static final BigDecimal mediaAprovado = new BigDecimal(6);
	
	static final BigDecimal mediaReprovado = new BigDecimal(3);

	static final BigDecimal mediaMinRecuperacao = new BigDecimal(6);
	public BigDecimal nota1() {
		return this.nota1;
	}

	public BigDecimal nota2() {
		return this.nota2;
	}

	public BigDecimal nota3() {
		return this.nota3;
	}

	public StatusAprovacao status() {
		return this.status;
	}

	public void registrarNota1(BigDecimal nota1) {
		this.nota1 = nota1;
	}

	public void registrarNota2(BigDecimal nota2) {
		this.nota2 = nota2;
	}

	public void registrarNota3(BigDecimal nota3) {
		this.nota3 = nota3;
	}
	
	public Integer frequencia() {
		return frequencia;
	}

	public void registrarFrequencia(Integer frequencia) {
		this.frequencia = frequencia;
	}
	
	/**
	 * Segue as regras estabelecidas pelos artigos do regulamento de graduação da UFRN: http://www.sistemas.ufrn.br/download/sigaa/public/regulamento_dos_cursos_de_graduacao.pdf
	 * 
	 * A partir do artigo 104
	 */
	public void consolidarParcialmente() {
		BigDecimal media = this.calcularMedia();
		if(media.compareTo(Matricula.mediaReprovado) == -1) {
				this.status = StatusAprovacao.REP;
		// APR, APRN
		}else if(this.atendeCriterioAssiduidade()) {
			if(media.compareTo(Matricula.mediaAprovado) >= 0 ) {
				this.status = StatusAprovacao.APR;				
			}else {				
				this.status= StatusAprovacao.REC;
			}
			
		}else {
			if(media.compareTo(new BigDecimal("3")) == -1) {
				this.status = StatusAprovacao.REPMF;
			}else {
				this.status = StatusAprovacao.REPF;					
			}
			
		}
	}

	private boolean todasAsNotasAcimaDe3() {
		return this.nota1.compareTo(new BigDecimal("3")) >= 0 && this.nota2.compareTo(new BigDecimal("3")) >= 0 && this.nota3.compareTo(new BigDecimal("3")) >= 0;
	}

	private Boolean atendeCriterioAssiduidade() {
		return this.frequencia() >= 75;
	}

	private BigDecimal calcularMedia() {
		BigDecimal soma = this.nota1.add(this.nota2).add(this.nota3);
        BigDecimal media = soma.divide(new BigDecimal("3"),1, RoundingMode.HALF_EVEN);
        System.out.println(media.toString());
        System.out.println("XXXXXX");
        return media;
	}


	
}
