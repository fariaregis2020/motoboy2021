package motoboyofficiall.br.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long id ;
	private String nome;
	private String telefone;
	private String rg;
	private String cpf ;
	private String email ;
	private String datanascimento;
	private String sexo;
	
	
	public Pessoa () {
		
	}


	public Pessoa(long id, String nome, String telefone, String rg, String cpf, String email, String datanascimento,
			String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.datanascimento = datanascimento;
		this.sexo = sexo;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDatanascimento() {
		return datanascimento;
	}


	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	
}
