package com.Car_Reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Car_Reservation_app.entity.User;
import com.Car_Reservation_app.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/loginPage")
	public String HomePage() {
		return "login/login";
	}

	@RequestMapping("/NewReg")
	public String showReg() {
		return "login/NewReg";
	}
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user")User user,Model model) {
    userRepo.save(user);
			model.addAttribute("msg", "your data is saved");
			return "login/login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId")String emailId,@RequestParam("password")String password,Model model) {
		User user = userRepo.findByEmail(emailId);
		if(user!=null) {
			if(user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
				return "findCar";
			}else {
				model.addAttribute("Error", "invalid username/password");
				return "login/login";
			}
		}
		model.addAttribute("Error", "invalid username/password");
		return "login/login";
	}
	
}

