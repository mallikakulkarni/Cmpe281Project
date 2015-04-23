package edu.sjsu.projectcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@ComponentScan
@Controller
@RequestMapping("/")
public class Application {
	@Controller
	public class GreetingController {
		@Autowired
		private  UserRepository repository;

		IUserHandler userHandler = new UserHandler();

		private 

		@RequestMapping("/greeting")
		public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
			model.addAttribute("name", name);
			return "greeting";
		}

	}
}