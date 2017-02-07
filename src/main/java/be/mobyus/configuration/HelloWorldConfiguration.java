package be.mobyus.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
/**
 * Configuration class for our coupling the response flow and the view pages.
 * we need
 * @EnableWebMvc to enable request mapping in the controller
 * @ComponentScan to indicate which package to scan for spring managed beans
 * 
 * @author Stijn
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "be.mobyus")
public class HelloWorldConfiguration {
	@Bean
	public ViewResolver viewResolver() {
	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setViewClass(JstlView.class);
	    viewResolver.setPrefix("/WEB-INF/views/");
	    viewResolver.setSuffix(".jsp");
	 
	    return viewResolver;
	}
}
