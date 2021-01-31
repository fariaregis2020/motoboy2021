package motoboyofficiall.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogradouroController {

	@RequestMapping("/logradouro")
	public String logradouro() {
		return "/cadastro/logradouro";
	}
	
}
