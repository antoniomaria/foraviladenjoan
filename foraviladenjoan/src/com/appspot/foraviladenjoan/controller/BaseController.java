package com.appspot.foraviladenjoan.controller;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appspot.foraviladenjoan.mvc.ModelAndView;

public abstract class BaseController extends HttpServlet{

	private static final long serialVersionUID = 5699171165164013540L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse  response)
			throws ServletException, IOException {
		ModelAndView modelAndView = onShowForm(request, response);
		Map<String, Object> model = modelAndView.getModel();
		String view = modelAndView.getView();
		Set<String> keys = model.keySet();
		
		for (String key : keys) {
			Object value = model.get(key);
			request.setAttribute(key, value);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
	
	public abstract ModelAndView onShowForm(HttpServletRequest request, HttpServletResponse response);
}
