package motoboyofficiall.br.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String num_telefone;
	private String operadora;
	
	
	public Telefone() {
		
	}


	public Telefone(long id, String num_telefone, String operadora) {
		super();
		this.id = id;
		this.num_telefone = num_telefone;
		this.operadora = operadora;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNum_telefone() {
		return num_telefone;
	}


	public void setNum_telefone(String num_telefone) {
		this.num_telefone = num_telefone;
	}


	public String getOperadora() {
		return operadora;
	}


	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}


	


	
}
