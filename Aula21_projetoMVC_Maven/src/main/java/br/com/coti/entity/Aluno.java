package br.com.coti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long    id;
	@Column(length=50)
	private String  nome;
	@Column
	private String  email;
	private String  disciplina;
	private Double  nota1;
	private Double  nota2;
	private Double  media;
    private String  situacao;
    
     public Aluno() {
		 
	}
    
    
	public Aluno(Long id, String nome, String email, String disciplina, Double nota1, Double nota2) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	
	public Aluno(Long id, String nome, String email, String disciplina, Double nota1, Double nota2, Double media,
			String situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
		this.situacao = situacao;
	}


	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", email=" + email + ", disciplina=" + disciplina + ", nota1="
				+ nota1 + ", nota2=" + nota2 + ", media=" + media + ", situacao=" + situacao + "]";
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

    
    
    
    
    
    
    
    
    
	
	
}
