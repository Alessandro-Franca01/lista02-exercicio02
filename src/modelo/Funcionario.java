package modelo;
import java.util.Date;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private String rg;
	private Date dataAdmissao;
	private Double salario;
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, String depart, String rg, Date dataAd, Double salario) {
		this.dataAdmissao = dataAd;
		this.departamento = depart;
		this.nome = nome;
		this.salario = salario;
		this.rg = rg;
	}
	
	public double recebeAumento(double acrescimo) {
		double valor = this.salario + acrescimo;
		return valor;
	}
	
	public double calculaGanhoAnual() {
		return this.salario*12;
	}
	
	public void imprimirdados() {
		System.out.println("\nNome: "+this.nome+"\nAdmissao: "+this.dataAdmissao+"\nRG: "+this.rg+"\nSalario: "+this.salario);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}


	
}
