package org.techshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tt")
public class TTController {

	@RequestMapping("/t01")
	public String test() {
		return "hello.html";
	}
}
