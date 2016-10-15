package client.Tabelas;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table
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
	private Integer id_propriedade;
	
	@NotNull
	@Column 
	private String nome;
	
	@NotNull
	@Column
	private String qualidade_cafe;
	
	@NotNull
	@Column
	private double area;
	
	@NotNull
	@Column
	private String variedade_café;
	
	 
	public int getId_talhao() {
		return id_talhao;
	}

	public void setId_talhao(int id_talhao) {
		this.id_talhao = id_talhao;
	}

	public Integer getId_propriedade() {
		return id_propriedade;
	}

	public void setId_propriedade(Integer id_propriedade) {
		this.id_propriedade = id_propriedade;
	}

	public String getQualidade_cafe() {
		return qualidade_cafe;
	}

	public void setQualidade_cafe(String qualidade_cafe) {
		this.qualidade_cafe = qualidade_cafe;
	}

	public double getArea_talhao() {
		return area;
	}

	public void setArea_talhao(double area_talhao) {
		this.area = area_talhao;
	}

	public String getVariedade_café() {
		return variedade_café;
	}

	public void setVariedade_café(String variedade_café) {
		this.variedade_café = variedade_café;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}


class TalhaoId implements Serializable {

	
	private static final long serialVersionUID = 1L;
	

	private Integer id_talhao;
	private Integer id_propriedade;
	
	
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


