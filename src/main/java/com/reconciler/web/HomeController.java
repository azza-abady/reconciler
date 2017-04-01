package com.reconciler.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Model model, String access) {
				
		if (access != null)
            model.addAttribute("access", "Your are not allowed to access the requested url.");
		
        return "home";
    }	
}
