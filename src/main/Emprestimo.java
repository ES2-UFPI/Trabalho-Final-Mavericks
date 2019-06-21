package main;
import java.util.Calendar;
import java.util.Date;

public class Emprestimo {

	private Exemplar exemplar;
	private Locatario locatario;
	private Calendar data_emp;
	private Calendar data_dev;
	
	public Emprestimo(Exemplar exemplar, Locatario locatario, Calendar data_emp, Calendar data_dev) {
		super();
		this.exemplar = exemplar;
		this.locatario = locatario;
		this.data_emp = data_emp;
		this.data_dev = data_dev;
	}

	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}

	public Calendar getData_emp() {
		return data_emp;
	}

	public void setData_emp(Calendar data_emp) {
		this.data_emp = data_emp;
	}

	public Calendar getData_dev() {
		return data_dev;
	}

	public void setData_dev(Calendar data_dev) {
		this.data_dev = data_dev;
	}
	
	
	
	
	
}
