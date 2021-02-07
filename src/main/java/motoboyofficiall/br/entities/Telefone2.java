package motoboyofficiall.br.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone2  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String ddd;
	private String telefone;
	private String operadora;
	
	
	
	
	public Telefone2 () {
		
		
	}




	public Telefone2(long id, String ddd, String telefone) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.telefone = telefone;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getDdd() {
		return ddd;
	}




	public void setDdd(String ddd) {
		this.ddd = ddd;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	public String getOperadora() {
		return operadora;
	}




	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}




	
	
	
}

