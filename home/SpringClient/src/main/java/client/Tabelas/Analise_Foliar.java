package client.Tabelas;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table
@IdClass(Analise_FoliarId.class)
public class Analise_Foliar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Embedded
	private Propriedade id_propriedade;
	 
	@Id
	private Date date;

	public Propriedade getId_propriedade() {
		return id_propriedade;
	}

	public void setId_propriedade(Propriedade id_propriedade) {
		this.id_propriedade = id_propriedade;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	} 
	
	

}

class Analise_FoliarId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Propriedade id_propriedade;
	private Date date;
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (id_propriedade.equals(((Analise_Foliar)obj).getId_propriedade())
			&& date.equals(((Analise_Foliar)obj).getDate())) {
			return true;
		}
		return false;
	}
}
