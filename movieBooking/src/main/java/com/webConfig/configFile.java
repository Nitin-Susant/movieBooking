package com.webConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "com")
@Component
@EnableWebMvc
public class configFile implements WebMvcConfigurer  {
 
	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate template = new JdbcTemplate(source());
	return template;
	}
	 
	public DataSource source() {
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setUrl("jdbc:mysql://localhost:3306/movie_ticket");
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUsername("root");
        source.setPassword("root");
        return source;
	}
@Bean
	public InternalResourceViewResolver resolver() {
	
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setSuffix(".jsp");
		resolver.setPrefix("/WEB-INF/view/");
		return resolver;
		
	}
	
}
