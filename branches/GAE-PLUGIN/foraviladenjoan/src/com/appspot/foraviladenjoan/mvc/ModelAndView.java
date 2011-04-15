package com.appspot.foraviladenjoan.mvc;

import java.util.Map;

public class ModelAndView {

	private Map<String, Object> model;

	private String view;

	public ModelAndView(Map<String, Object> model, String view) {
		super();
		this.model = model;
		this.view = view;
	}

	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

}
