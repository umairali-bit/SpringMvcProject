
package com.springmvc.main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.springmvc.main.controller","com.springmvc.main.model"
								,"com.springmvc.main.service","com.springmvc.main.persistence"})
public class ControllerConfig implements WebMvcConfigurer{
	
	
	@Bean //bean will add the context to mainController
	
		public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("WEB-INF/jsps/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	//configuration to DB
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/75584_mavericks");
		ds.setUsername("root");
		ds.setPassword("6102075b");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}

}
