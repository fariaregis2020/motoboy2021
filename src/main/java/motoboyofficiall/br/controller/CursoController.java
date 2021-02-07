package motoboyofficiall.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import motoboyofficiall.br.entities.Curso;
import motoboyofficiall.br.repository.CursoRepository;

@Controller
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;
	
	@RequestMapping(method = RequestMethod.GET, value ="/curso")
	private String curso() {
		return "/cadastro/curso";
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/curso")
	private String curso(Curso curso) {
		cursoRepository.save(curso);
		return "/cadastro/curso";
	}

	
	
	
}
