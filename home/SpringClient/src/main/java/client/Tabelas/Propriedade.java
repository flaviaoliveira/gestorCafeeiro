package client.Tabelas;
import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
@Embeddable
public class Propriedade implements Serializable{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id_propriedade;
	private String nome;
	private double lavoura_tamanho;
	private double propriedade_tamanho;
	private String estado;
	private String cidade;
	private String municipio;
	private double altitude;
	private int covas_numero;
	
	public int getId() {
		return id_propriedade;
	}
	public void setId(int id) {
		this.id_propriedade = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLavoura_tamanho() {
		return lavoura_tamanho;
	}
	public void setLavoura_tamanho(double lavoura_tamanho) {
		this.lavoura_tamanho = lavoura_tamanho;
	}
	public double getPropriedade_tamanho() {
		return propriedade_tamanho;
	}
	public void setPropriedade_tamanho(double propriedade_tamanho) {
		this.propriedade_tamanho = propriedade_tamanho;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public int getCovas_numero() {
		return covas_numero;
	}
	public void setCovas_numero(int covas_numero) {
		this.covas_numero = covas_numero;
	}
	
	
}
