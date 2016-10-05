package client.Tabelas;
import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.crypto.Data;


@Entity
@Table
@Embeddable
@IdClass(Praga_PropriedadeId.class)
public class Praga_Propriedade implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Embedded
	private Tipos_Pragas id_pragas;
	@Id
	@Embedded
	private Propriedade id_propriedade;
	
	private Data data_inicio;
	private Data data_fim;
	
	public Tipos_Pragas getId_pragas() {
		return id_pragas;
	}
	public void setId_pragas(Tipos_Pragas id_pragas) {
		this.id_pragas = id_pragas;
	}
	public Propriedade getId_propriedade() {
		return id_propriedade;
	}
	public void setId_propriedade(Propriedade id_propriedade) {
		this.id_propriedade = id_propriedade;
	}
	public Data getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Data data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Data getData_fim() {
		return data_fim;
	}
	public void setData_fim(Data data_fim) {
		this.data_fim = data_fim;
	}
	

}
class Praga_PropriedadeId implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Tipos_Pragas id_pragas;
	private Propriedade id_propriedade;
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (id_propriedade.equals(((Praga_Propriedade)obj).getId_propriedade())
				&& id_pragas.equals(((Praga_Propriedade)obj).getId_pragas())) {
			return true;
		}
		return false;
	}
	
}

