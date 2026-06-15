package com.example.SpringRestproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringRestproject.Service.UserService;
import com.example.SpringRestproject.entity.User;
import com.example.SpringRestproject.entity.feedback;


@Controller
public class UserController {
@Autowired
UserService userService;
@GetMapping("/")
public String loginpage() {
	return "login";
}

@GetMapping("/register")
public String registerpage() {
	return "register";
}
@PostMapping("/registerpage")
public String registerpage(@ModelAttribute User user,Model model) {
	String result=userService.Register(user);
	if(result.equals("Register Successfully")) {
	model.addAttribute("success", result);
	return "login";
	}
	model.addAttribute("error", result);
	return "register";
	
	}
@PostMapping("/login")
public String Login(@RequestParam String email,@RequestParam String password,Model model) {
	User user=userService.Login(email, password);
	if(user != null) {
		model.addAttribute("name", user.getEmail());
		model.addAttribute("success", "login successfull");
		return "feedback";
	}
	model.addAttribute("error", "Invalid Email And Password");
	return "login";
}

//@PostMapping("/feedback")
//public String savedata(feedback feedback) {
//	  System.out.println("--->"+feedback);
//	  userService.addemp(feedback);
//	  return "feedback";
//}



}
