package br.com.coti.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.coti.entity.Aluno;

public interface AlunoRepository  extends CrudRepository<Aluno,Long>{
	
	
	 public Aluno findByEmail(String email);
	 
	 public Aluno findByNomeAndEmail(String nome,String email);
	
	 

}
