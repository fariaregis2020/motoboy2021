package motoboyofficiall.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import motoboyofficiall.br.entities.Bairro;
import motoboyofficiall.br.repository.BairroRepository;

@Controller
public class BairroController {
	
	@Autowired
	private BairroRepository bairroRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/salvar_bairro")
	public String bairro () {
		return "/cadastro/bairro";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/salvar_bairro")
	public String bairro (Bairro bairro) {
		bairroRepository.save(bairro);
		return "/cadastro/bairro";
	}

	
	
}
