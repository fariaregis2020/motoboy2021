package motoboyofficiall.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import motoboyofficiall.br.entities.Telefone;
import motoboyofficiall.br.repository.TelefoneRepository;

@Controller
public class TelefoneController {

	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@RequestMapping(method = RequestMethod.GET, value ="/salvar_telefone")
	public String telefone() {
		return "/cadastro/telefone";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/salvar_telefone")
	public String telefone(Telefone telefone) {
		telefoneRepository.save(telefone);
		return "/cadastro/telefone";
	}

	
}
