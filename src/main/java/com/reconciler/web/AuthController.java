package com.reconciler.web;


import java.util.HashSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reconciler.model.Role;
import com.reconciler.model.User;
import com.reconciler.repository.RoleRepository;
import com.reconciler.repository.UserRepository;

@Controller
public class AuthController {

	@Autowired
    private UserRepository userRepository;
	
	@Autowired
    private RoleRepository roleRepository;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
    
    @PostConstruct
    public void run(){

    	Role r1 = new Role();
    	r1.setId(1l);
    	r1.setName("Admin");
    	Role r2 = new Role();
    	r2.setId(2l);
    	r2.setName("User");
    	roleRepository.save(r1);
    	roleRepository.save(r2);
    	
    	User user = new User();
    	user.setUsername("hazem");
    	user.setPassword(bCryptPasswordEncoder.encode("123456"));
        user.setRoles(new HashSet<Role>(roleRepository.findAll()));
        userRepository.save(user);
    }
}
