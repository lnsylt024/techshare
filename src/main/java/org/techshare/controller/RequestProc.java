package org.techshare.controller;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/req")
@Controller
public class RequestProc {

	@RequestMapping(value = "/test01")
	public String test01() {
		return "test01.html";
	}

	// old for thymeleaf
	@GetMapping("/test02")
	public String test02(Model model) {
		model.addAttribute("message02", "Hello Thymeleaf!!(test02)");
		return "test01.html";
	}

	// new for thymeleaf
	@RequestMapping("/test03")
	public String test03(Model model) {
		model.addAttribute("message03", "Hello Thymeleaf!!(test03)");

		model.addAttribute("aList", Arrays.asList("hoge", "fuga", "piyo"));

		HashMap<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		model.addAttribute("aMap", map);

		return "test01.html";
	}

	// new for EL
	@RequestMapping("/test04")
	public String test04(Model model) {
		model.addAttribute("message04", "Hello Thymeleaf!!(test04)");
		return "test02.html";
	}

	@RequestMapping("/test05")
	public String test05() {
		return "test01.html";
	}
}
