package main;
import java.util.Date;

public class Emprestimo {

	private Exemplar exemplar;
	private Locatario locatario;
	private Date data_emp;
	private Date data_dev;
	
	public Emprestimo(Exemplar exemplar, Locatario locatario, Date data_emp, Date data_dev) {
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

	public Date getData_emp() {
		return data_emp;
	}

	public void setData_emp(Date data_emp) {
		this.data_emp = data_emp;
	}

	public Date getData_dev() {
		return data_dev;
	}

	public void setData_dev(Date data_dev) {
		this.data_dev = data_dev;
	}
	
	
	
	
	
}
