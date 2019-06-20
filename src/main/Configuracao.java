package main;

public class Configuracao {
	
	private double multa;
	private int dias;
	
	public Configuracao(double multa, int dias){
		this.setDias(dias);
		this.setMulta(multa);
	}
	
	public double getMulta() {
		return multa;
	}
	
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	public int getDias() {
		return dias;
	}
	
	public void setDias(int dias) {
		this.dias = dias;
	} 

}
