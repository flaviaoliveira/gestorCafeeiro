package client.Tabelas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table
public class Produtor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id 
	@NotNull(message = "Campo Obrigatório!")
	@Column
	private String cpf;
 
	
	@NotNull(message = "Campo Obrigatório!")
	@Column
	private String  email;
	
	@NotNull(message = "Campo Obrigatório!")
	@Column
	private String  nome;
	
	@NotNull(message = "Campo Obrigatório!")@Size(min=6, message = "Minimo 6 caracteres!")
	@Column
	private String senha;
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
