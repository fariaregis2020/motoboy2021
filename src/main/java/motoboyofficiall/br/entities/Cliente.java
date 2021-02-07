package motoboyofficiall.br.entities;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String telefone;
	private String nome;
	private String logrodouro;
	private String numero;
	private String complemento;
	private String dataCadastro;


	
	
	public Cliente() {

	}

	public Cliente(long id, String telefone, String nome, String logrodouro, String numero, String complemento,
			String dataCadastro) {
		super();
		this.id = id;
		this.telefone = telefone;
		this.nome = nome;
		this.logrodouro = logrodouro;
		this.numero = numero;
		this.complemento = complemento;
		this.dataCadastro = dataCadastro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogrodouro() {
		return logrodouro;
	}

	public void setLogrodouro(String logrodouro) {
		this.logrodouro = logrodouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
