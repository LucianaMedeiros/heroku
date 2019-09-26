package br.com.coti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.coti.entity.Aluno;
import br.com.coti.repository.AlunoRepository;

@Controller
public class ControllerAluno {
	 @Autowired
	 private AlunoRepository dao;
	 
	  @GetMapping("/")
       public ModelAndView index() {
		  ModelAndView mv =new ModelAndView("sistema");
		    mv.addObject("lista",(List<Aluno>) dao.findAll());
		   return mv;
	  }
	  
	  	  
	  
	  @PostMapping(value="/alunomvc",
			  consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			  produces=MediaType.TEXT_PLAIN_VALUE
			  )
      public ModelAndView index(
    		  @RequestParam String nome,
    		  @RequestParam String email,
    		  @RequestParam String disciplina,
    		  @RequestParam String nota1,
    		  @RequestParam String nota2
    		  ) {
		  ModelAndView mv =new ModelAndView("sistema");
		  try {
		  Aluno a = new Aluno(null, nome, email, disciplina,
				   new Double(nota1), new Double( nota2));
		  
		     a.setMedia((a.getNota1()+ a.getNota2())/2);
		     a.setSituacao(a.getMedia()>=7?"aprovado":"reprovado");
		  
		  dao.save(a);
		  mv.addObject("lista",(List<Aluno>) dao.findAll());
		  mv.addObject("msg","dados Gravados");
		  }catch(Exception ex) {
			  mv.addObject("error",ex.getMessage());  
		  }
		  return mv;
	  }
	  
	  
	  @GetMapping(value="/excluirmvc/{id}")
      public ModelAndView exluir(
    		  @PathVariable Long id, Model model
    		  ) {
		  ModelAndView mv = new ModelAndView("sistema");
		  Aluno aluno= dao.findById(new Long(id)).
         orElseThrow(()-> new IllegalArgumentException("Nao Encontrado"));
		   dao.delete(aluno);
         model.addAttribute("lista",(List<Aluno>) dao.findAll());
	    return mv;
	  }
	  
	  
	  
	  
	  @GetMapping("/alunorest")
      public ResponseEntity<List<Aluno>> lista() {
		  ModelAndView mv =new ModelAndView("sistema");
		  List <Aluno> lista =  (List<Aluno>) dao.findAll();
		   return  ResponseEntity.ok(lista);
	  }
	  
	  

	
}
