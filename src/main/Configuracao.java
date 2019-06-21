package main;

public class Configuracao {
	
	private double multa;
	private int diasProf;
	private int diasTec;
	private int diasAluno;
	
	public Configuracao(float multa, int diasTec, int diasProf, int diasAluno){
		this.setDiasTec(diasTec);
		this.setDiasAluno(diasProf);
		this.setDiasAluno(diasAluno);
		this.setMulta(multa);
	}
	
	public int getDiasProf() {
		return diasProf;
	}

	public void setDiasProf(int diasProf) {
		this.diasProf = diasProf;
	}

	public int getDiasTec() {
		return diasTec;
	}

	public void setDiasTec(int diasTec) {
		this.diasTec = diasTec;
	}

	public int getDiasAluno() {
		return diasAluno;
	}

	public void setDiasAluno(int diasAluno) {
		this.diasAluno = diasAluno;
	}

	public double getMulta() {
		return multa;
	}
	
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
}
