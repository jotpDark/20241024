package com.wintux._4.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrincipalController {
	@RequestMapping("/")
	@ResponseBody
	public String saludo() {
		return "Hola desde Apache Tomcat :D";
	}
}
