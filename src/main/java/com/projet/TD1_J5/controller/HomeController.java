package com.projet.TD1_J5.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projet.TD1_J5.model.Employee;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value = "p2",method = RequestMethod.GET)
	public String showpage()
	{
		
		return "page2";
	}
	@RequestMapping(value = "evaluation",method = RequestMethod.GET)
	public String getForm()
	{
		return "Employee";
		
	}
	@RequestMapping(value = "evaluation", method = RequestMethod.POST)
	public String evaluate(Model m, HttpServletRequest req)
	{
		String nom=req.getParameter("nom");
		String salaire=req.getParameter("salaire");
		Employee em=new Employee(nom, Integer.parseInt(salaire));
		m.addAttribute("employee",em.toString());
		return "Employee";
	}
	
}
