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
public class Proprietario implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	private String cpf;
	
	private String  email;
	
	private String  nome;
	
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

	public void preencheProprietario(String cpf,String  email, String  nome, String senha){
		Proprietario prop = new Proprietario();
		prop.setCpf(cpf);
		prop.setEmail(email);
		prop.setNome(nome);
		prop.setSenha(senha);

	}
	
	
}
