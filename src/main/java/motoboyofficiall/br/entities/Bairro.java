package motoboyofficiall.br.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bairro  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String nomeBairro;
	
	
	
	
	public Bairro () {
		
		
	}




	public Bairro(long id, String nomeBairro) {
		super();
		this.id = id;
		this.nomeBairro = nomeBairro;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getNomeBairro() {
		return nomeBairro;
	}




	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}


	
	
	
	
	
}

