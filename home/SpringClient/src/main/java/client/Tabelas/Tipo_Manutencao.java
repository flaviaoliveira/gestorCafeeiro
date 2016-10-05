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
public class Tipo_Manutencao implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id_manutencao;
	
	private String nome;
	
	private String descricao;

	public int getId_manutencao() {
		return id_manutencao;
	}

	public void setId_manutencao(int id_manutencao) {
		this.id_manutencao = id_manutencao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
