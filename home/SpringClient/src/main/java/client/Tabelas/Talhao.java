package client.Tabelas;
import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table
@Embeddable
@IdClass(TalhaoId.class)
public class Talhao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id_talhao;
	
	@Id
	@Embedded
	private Propriedade id_propriedade;
	 
	private String qualidade_cafe;
	
	private double area_talhao;
	
	private String variedade_café;

	public int getId_talhao() {
		return id_talhao;
	}

	public void setId_talhao(int id_talhao) {
		this.id_talhao = id_talhao;
	}

	public Propriedade getId_propriedade() {
		return id_propriedade;
	}

	public void setId_propriedade(Propriedade id_propriedade) {
		this.id_propriedade = id_propriedade;
	}

	public String getQualidade_cafe() {
		return qualidade_cafe;
	}

	public void setQualidade_cafe(String qualidade_cafe) {
		this.qualidade_cafe = qualidade_cafe;
	}

	public double getArea_talhao() {
		return area_talhao;
	}

	public void setArea_talhao(double area_talhao) {
		this.area_talhao = area_talhao;
	}

	public String getVariedade_café() {
		return variedade_café;
	}

	public void setVariedade_café(String variedade_café) {
		this.variedade_café = variedade_café;
	}

}


class TalhaoId implements Serializable {

	
	private static final long serialVersionUID = 1L;
	

	private Integer id_talhao;
	private Propriedade id_propriedade;
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (id_propriedade.equals(((Talhao)obj).getId_propriedade())
				&& id_talhao.equals(((Talhao)obj).getId_talhao())) {
			return true;
		}
		return false;
	}
	
}


