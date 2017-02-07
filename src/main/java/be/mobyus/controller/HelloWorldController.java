package be.mobyus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.mobyus.bean.Student;
/**
 * Controllers class handling incoming http requests.
 * As we use @EnableWebMvc in our configuration we are able to map different url in this contoller.
 * 
 * @author Stijn
 *
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {
	 
	/**
	 * As we mapped our controller to the root this method will be executed on http get load.
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Mobyus Spring MVC course.");
        model.addAttribute("link","welcomeback");
        return "welcome";
    }
 
	/**
	 * By setting a specific url our get http get coupled to this method, using the requestmethod
	 * param we can serve multiple requests from the same controller
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/welcomeback", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Welcome back to Hello World @ Mobyus Spring MVC course");
        model.addAttribute("link","register");
        return "welcome";
    }
    @RequestMapping(value = "/goodbye", method = RequestMethod.GET)
    public String sayGoodbye(ModelMap model) {
        model.addAttribute("title", "Mobyus Spring MVC course");
        return "goodbye";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam String email, @RequestParam String name, ModelMap model) {
    	Student candidate = new Student();
    	candidate.setEmail(email);
    	candidate.setName(name);
        model.addAttribute("candidate", candidate);
        return "registered";
    }
}
