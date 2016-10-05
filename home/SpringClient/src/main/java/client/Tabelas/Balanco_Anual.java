package client.Tabelas;
import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table
@IdClass(Balanco_AnualId.class)
public class Balanco_Anual implements Serializable{
	@Id 
	private Integer ano;
	
	@Id
	@Embedded
	private Propriedade id_propriedade;
	
	private double produtividade;
	
	private double insumos_qnt;
	
	private double temperatura_media;
	
	private double custo_produzir_saca;

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Propriedade getId_propriedade() {
		return id_propriedade;
	}

	public void setId_propriedade(Propriedade id_propriedade) {
		this.id_propriedade = id_propriedade;
	}

	public double getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(double produtividade) {
		this.produtividade = produtividade;
	}

	public double getInsumos_qnt() {
		return insumos_qnt;
	}

	public void setInsumos_qnt(double insumos_qnt) {
		this.insumos_qnt = insumos_qnt;
	}

	public double getTemperatura_media() {
		return temperatura_media;
	}

	public void setTemperatura_media(double temperatura_media) {
		this.temperatura_media = temperatura_media;
	}

	public double getCusto_produzir_saca() {
		return custo_produzir_saca;
	}

	public void setCusto_produzir_saca(double custo_produzir_saca) {
		this.custo_produzir_saca = custo_produzir_saca;
	}
	

	
}


class Balanco_AnualId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public Integer ano;
	public Propriedade id_propriedade;
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (id_propriedade.equals(((Balanco_Anual)obj).getId_propriedade())
			&& ano.equals(((Balanco_Anual)obj).getAno())) {
			return true;
		}
		return false;
	}
}