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
@IdClass(Despesas_Aplicacao_InsumosId.class)
public class Despesas_Aplicacao_Insumos implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Embedded
	private Talhao id_talhao;
	@Id
	@Embedded
	private Propriedade id_propriedade;
	@Id
	private Data data;
	
	private Tipo_Insumo id_insumo;
	
	private double qnt_insumo;
	
	private double preco_unitario;

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

	public Tipo_Insumo getId_insumo() {
		return id_insumo;
	}

	public void setId_insumo(Tipo_Insumo id_insumo) {
		this.id_insumo = id_insumo;
	}

	public double getQnt_insumo() {
		return qnt_insumo;
	}

	public void setQnt_insumo(double qnt_insumo) {
		this.qnt_insumo = qnt_insumo;
	}

	public double getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

class Despesas_Aplicacao_InsumosId implements Serializable{
	
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
		if (id_propriedade.equals(((Despesas_Aplicacao_Insumos)obj).getId_propriedade())
			&& data.equals(((Despesas_Aplicacao_Insumos)obj).getData())&& id_talhao.equals(((Despesas_Aplicacao_Insumos)obj).getId_talhao())) {
			return true;
		}
		return false;
	}
}
