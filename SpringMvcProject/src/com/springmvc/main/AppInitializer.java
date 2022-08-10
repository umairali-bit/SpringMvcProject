package com.springmvc.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{//coming from webmvc in POM

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classes = new Class[] {ControllerConfig.class};
		return classes;
	}
	 
	@Override
	protected String[] getServletMappings() {
		String[] str = new String[] {"/"};
		return str;
	}

}
