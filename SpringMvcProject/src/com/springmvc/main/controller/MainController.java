package com.springmvc.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.main.model.Vendor;

@Controller
public class MainController {
	
	@Autowired
	private Vendor v; //for instantiation - destroying v-null gc.cleaner();
	
	/* Three ways to pass the data to servelet Model model, HttpServeletRequest and ModelAndView */

	@RequestMapping("/")
	//public String sayHello() { 
		//return "/WEB-INF/jsps/index.jsp"; cuz we are using prefix and suffix in controllerConfig
	
	
	
	public String viewIndex(Model model) { //Dependency Injection (DI) in spring-mvc,example injecting model in viewIndex
		//IOC: Inversion of control, spring maintains lifecycle of dependency + Autowire, example model
		//Autowire can also be done in mvc
		//private Model model, not possible in spring
		//pass the variable username to index.jsp page
		model.addAttribute("username","harry potter");
		return "index";
	}
	
	
	@RequestMapping("/products")
	//public String showProducts() {
		//return "/WEB-INF/jsps/products.jsp"; cuz we are using prefix and suffix in controllerConfig
		
		//pass an array to product.jsp
	public String showProducts(HttpServletRequest request) {
		
		String[] names = new String[] {"micheal", "keith","john"};
		request.setAttribute("namesArr", names);
		
		
		
		return "products";
	}
	
	
	@RequestMapping("/vendors")
	public ModelAndView showVendors(ModelAndView mav, Vendor v) {//create a pojo or give reference in arguments
		//pass an object to jsp
		//Vendor v = new Vendor(); //pojo plain old java object
		v.setId(1L);
		v.setName("ABC ELECTRONICS");
		
		mav.addObject("vendorObj", v);
		mav.setViewName("vendors");
		
		return mav;
		
	}
	
	
	
}
