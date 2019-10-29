package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	// without annotations
	/*@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("WelcomeMessage", "Hi User, Welcome to first spring mvc application!");
		return modelandview;
	}*/
	
	// with annotations
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String, String> pathVars) {
		
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Welcome to Spring mvc annotations setting. " + name + " You are from " + country);
		return modelandview;
	}

}
