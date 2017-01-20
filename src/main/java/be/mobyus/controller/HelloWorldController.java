package be.mobyus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	 
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Mobyus Spring MVC course.");
        return "welcome";
    }
 
    @RequestMapping(value = "/welcomeback", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Welcome back to Hello World @ Mobyus Spring MVC course");
        return "welcome";
    }
}
