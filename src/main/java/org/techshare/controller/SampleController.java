package org.techshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.techshare.form.SampleForm;

@Controller
@RequestMapping("/sampleform")
public class SampleController {

	@GetMapping
	public String init(Model model) {
		model.addAttribute(new SampleForm());
		return "sample.html";
	}

	@PostMapping
	public String submit(SampleForm sampleFrm) {
		System.out.println("form.isChecked=" + sampleFrm.isChecked());
		System.out.println("form.value=" + sampleFrm.getValue());
		System.out.println("form.radioValue=" + sampleFrm.getRadioValue());
		System.out.println("form.selectValue=" + sampleFrm.getSelectValue());
		return "sample.html";
	}
}
