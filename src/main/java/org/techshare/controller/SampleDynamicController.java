package org.techshare.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.techshare.form.SampleDynamicForm;
import org.techshare.other.Row;

@Controller
@RequestMapping("/sampleD")
public class SampleDynamicController {

	@GetMapping
	public String init(Model model) {
		model.addAttribute(new SampleDynamicForm());
		return "sampleD.html";
	}

	@PostMapping(params = "appendRow")
	public String appendRow(SampleDynamicForm form) {
		form.appendRow();
		this.printRows(form);
		return "sampleD.html";
	}

	@PostMapping(params = "removeIndex")
	public String removeRow(SampleDynamicForm form, @RequestParam int removeIndex) {
		form.removeRow(removeIndex);
		this.printRows(form);
		return "sampleD.html";
	}

	private void printRows(SampleDynamicForm form) {
		List<Row> rows = form.getRows();

		for (int i = 0; i < rows.size(); i++) {
			Row row = rows.get(i);
			System.out.println("i=" + i + ", row.value=" + row.getValue());
		}

	}

}
