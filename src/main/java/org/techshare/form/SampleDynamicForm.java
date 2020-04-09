package org.techshare.form;

import java.util.ArrayList;
import java.util.List;

import org.techshare.other.Row;

public class SampleDynamicForm {

	private List<Row> rows= new ArrayList<>();

	public void appendRow() {
		this.rows.add(new Row());
	}
	
	public void removeRow(int index) {
		this.rows.remove(index);
	}
	
	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}
	
}
