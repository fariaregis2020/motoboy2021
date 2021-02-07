package motoboyofficiall.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import motoboyofficiall.br.entities.Bairro;
import motoboyofficiall.br.entities.Telefone2;
import motoboyofficiall.br.repository.BairroRepository;
import motoboyofficiall.br.repository.TelefoneRepository2;

@Controller
public class TelefoneController2 {
	
	@Autowired
	private TelefoneRepository2 telefoneRepository2;

	@RequestMapping(method = RequestMethod.GET, value = "/salvar_telefone2")
	public String telefone2() {
		return "/cadastro/telefone";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/salvar_telefone2")
	public String bairro (Telefone2 telefone2) {
		telefoneRepository2.save(telefone2);
		return "/cadastro/telefone";
	}

	
	
}
