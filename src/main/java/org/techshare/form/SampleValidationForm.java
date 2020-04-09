package org.techshare.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.techshare.validation.MyValidation;

@MyValidation
public class SampleValidationForm {

	@Size(min = 3,message = "size error")
	private String text;
	
	@Min(value = 100)
	private Integer number;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
}
