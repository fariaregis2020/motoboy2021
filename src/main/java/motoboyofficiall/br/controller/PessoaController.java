package motoboyofficiall.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import motoboyofficiall.br.entities.Pessoa;
import motoboyofficiall.br.repository.PessoaRepository;

@Controller
public class PessoaController {

	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@RequestMapping(method = RequestMethod.GET, value ="/pessoa")
	public String pessoa () {
		return "cadastro/pessoa";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/pessoa")
	public String pessoa (Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return "cadastro/pessoa";
	}
	

	
	
}
