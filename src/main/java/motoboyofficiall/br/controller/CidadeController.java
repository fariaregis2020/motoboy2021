package motoboyofficiall.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import motoboyofficiall.br.entities.Cidade;
import motoboyofficiall.br.repository.CidadeRepository;

@Controller
public class CidadeController {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@RequestMapping(method = RequestMethod.GET, value ="/cidade")
	private String cidade () {
		return "/cadastro/cidade";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/cidade")
	private String cidade (Cidade cidade) {
		cidadeRepository.save(cidade);
		return "/cadastro/cidade";
	}
	
	
	
}
