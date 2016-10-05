package client.Tabelas;
import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table
@Embeddable
@IdClass(Propriedade_ProdutorId.class)
public class Propriedade_Produtor implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Embedded
	private Propriedade id_propriedade;
	@Id
	@Embedded
	private Proprietario id_proprietario;
	
	public Propriedade getId_propriedade() {
		return id_propriedade;
	}
	public void setId_propriedade(Propriedade id_propriedade) {
		this.id_propriedade = id_propriedade;
	}
	public Proprietario getId_proprietario() {
		return id_proprietario;
	}
	public void setId_proprietario(Proprietario id_proprietario) {
		this.id_proprietario = id_proprietario;
	}
	
	
}

class Propriedade_ProdutorId implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Propriedade id_propriedade;
	private Proprietario id_proprietario;
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (id_propriedade.equals(((Propriedade_Produtor)obj).getId_propriedade())
				&& id_proprietario.equals(((Propriedade_Produtor)obj).getId_proprietario())) {
			return true;
		}
		return false;
	}
	
}

