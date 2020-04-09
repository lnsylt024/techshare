package org.techshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.techshare.form.SampleValidationForm;

@Controller
@RequestMapping("/sampleV")
public class SampleValidationController {

	@GetMapping
	public String init(Model model) {
		model.addAttribute(new SampleValidationForm());
		return "validation.html";
	}

	@PostMapping
	public String submit(@Validated SampleValidationForm form, BindingResult result) {
		System.out.println("*************************************");
		System.out.println("form=" + form);
		System.out.println("result=" + result);
		System.out.println("*************************************");
		return "validation.html";
	}
}
