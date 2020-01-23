package com.hib.val;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hib.val.bean.User;

@Controller
public class HelloController {
	
	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("user1", new User());
		return "form";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("user1") @Valid User user1, BindingResult result, Model model) {
		
		ModelAndView mv = new ModelAndView("");
		mv.addObject("user", user1);
		if(result.hasErrors())
			return "form";
		return "home";
	}
}
