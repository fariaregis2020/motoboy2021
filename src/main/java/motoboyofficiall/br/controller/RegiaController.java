package motoboyofficiall.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import motoboyofficiall.br.entities.Regiao;
import motoboyofficiall.br.repository.RegiaoRepositoy;

@Controller
public class RegiaController {

	@Autowired
	private RegiaoRepositoy regiaoRepositoy;
	
	@RequestMapping(method = RequestMethod.GET, value ="/regiao")
	public String regiao() {
		return "/cadastro/regiao";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/regiao")
	public String regiao(Regiao regiao) {
		regiaoRepositoy.save(regiao);
		return "/cadastro/regiao";
	}

	
	
}
