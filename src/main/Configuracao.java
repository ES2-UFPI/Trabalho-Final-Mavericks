package main;

public class Configuracao {
	private double multa; 
	private int dias;
	
	public Configuracao(double multa, int dias){
		this.setMulta(multa);
		this.setDias(dias);
	}
	
	public double getMulta() {
		return this.multa;
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
