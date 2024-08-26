package com.webConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class dispConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("fc waee"); 
		
		AnnotationConfigWebApplicationContext acwac = new AnnotationConfigWebApplicationContext();
		 acwac.register(configFile.class);
		
		DispatcherServlet disp  =new DispatcherServlet(acwac);
		Dynamic addServlet = servletContext.addServlet("fr", disp);
		addServlet.setLoadOnStartup(1);
		addServlet.addMapping("/");

	}

}
