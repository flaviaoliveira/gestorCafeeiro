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
//@Embedded
@IdClass(Despesas_ManutencaoId.class)
public class Despesas_Manutencao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Embedded
	private Talhao id_talhao;
	
	@Id
	@Embedded
	private Propriedade id_propriedade;
	@Id
	private Data data;
	
	//@Embedded
	private Tipo_Manutencao id_manutencao;
	
	private int funcinarios_quantidade;
	private double valor_unitario_pago;
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
	public Tipo_Manutencao getId_manutencao() {
		return id_manutencao;
	}
	public void setId_manutencao(Tipo_Manutencao id_manutencao) {
		this.id_manutencao = id_manutencao;
	}
	public int getFuncinarios_quantidade() {
		return funcinarios_quantidade;
	}
	public void setFuncinarios_quantidade(int funcinarios_quantidade) {
		this.funcinarios_quantidade = funcinarios_quantidade;
	}
	public double getValor_unitario_pago() {
		return valor_unitario_pago;
	}
	public void setValor_unitario_pago(double valor_unitario_pago) {
		this.valor_unitario_pago = valor_unitario_pago;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

class Despesas_ManutencaoId implements Serializable {

	
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
		if (id_propriedade.equals(((Despesas_Manutencao)obj).getId_propriedade())
			&& data.equals(((Despesas_Manutencao)obj).getData())&& id_talhao.equals(((Despesas_Manutencao)obj).getId_talhao())) {
			return true;
		}
		return false;
	}
	
}
