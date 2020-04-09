package org.techshare.form;

import java.util.LinkedHashMap;
import java.util.Map;

public class SampleForm {

	private String value;

	private boolean checked;

	private String selectValue;
	
	private String radioValue;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSelectValue() {
		return selectValue;
	}

	public void setSelectValue(String selectValue) {
		this.selectValue = selectValue;
	}

	public Map<String, String> radioButtons() {
		Map<String, String> radioButtons = new LinkedHashMap<>();
		radioButtons.put("key_hoge", "val_HOGE");
		radioButtons.put("key_fuga", "val_FUGA");
		radioButtons.put("key_piyo", "val_PIYO");
		return radioButtons;
	}
	
	public Map<String, String> options() {
		Map<String, String> radioButtons = new LinkedHashMap<>();
		radioButtons.put("key_hoge", "val_HOGE");
		radioButtons.put("key_fuga", "val_FUGA");
		radioButtons.put("key_piyo", "val_PIYO");
		return radioButtons;
	}

	public String getRadioValue() {
		return radioValue;
	}

	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}
}
