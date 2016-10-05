package client.Tabelas;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.crypto.Data;


@Entity
@Table
@IdClass(Despesas_BeneficiamentoId.class)
public class Despesas_Beneficiamento implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@Embedded
	private Talhao id_talhao;
	@Id
	@Embedded
	private Propriedade id_propriedade;
	@Id
	private Data data;
	
	private double custo_hr_secador;
	
	private double hrs_terreiro;
	
	private double hrs_secador;

	public Talhao getId_talhao() {
		return id_talhao;
	}

	public void setId_talhao(Talhao id_talhao) {
		this.id_talhao = id_talhao;
	}

	public Propriedade getId_propriedade() {
		return id_propriedade;
	}

	public void setId_propriedade(Propriedade id_propriedade) {
		this.id_propriedade = id_propriedade;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public double getCusto_hr_secador() {
		return custo_hr_secador;
	}

	public void setCusto_hr_secador(double custo_hr_secador) {
		this.custo_hr_secador = custo_hr_secador;
	}

	public double getHrs_terreiro() {
		return hrs_terreiro;
	}

	public void setHrs_terreiro(double hrs_terreiro) {
		this.hrs_terreiro = hrs_terreiro;
	}

	public double getHrs_secador() {
		return hrs_secador;
	}

	public void setHrs_secador(double hrs_secador) {
		this.hrs_secador = hrs_secador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

class Despesas_BeneficiamentoId implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Talhao id_talhao;
	private Propriedade id_propriedade;
	private Data data;
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (id_propriedade.equals(((Despesas_Beneficiamento)obj).getId_propriedade())
			&& data.equals(((Despesas_Beneficiamento)obj).getData())&& id_talhao.equals(((Despesas_Beneficiamento)obj).getId_talhao())) {
			return true;
		}
		return false;
	}
	
}
