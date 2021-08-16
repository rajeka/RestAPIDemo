package com.example.rest1;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket swaggerApiConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.build(); // this gives api documention. note higer version EnableSwagger2Web gives a issue
				//.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfo(
				"Swagger API Demo by Ranjan Ekana",
				"API reference by", 
				"1.0.0",
				"Public API",
				"","","") ;
		}
//				"Swagger API Demo by Ranjan Ekana",
//				"API reference by",
//				"1.0.0",
//				"Public API",
//				new Contact(
//						v
//						"https://www.raviro.com","API License Open","", Collections.emptyList()));
		
	
	
}
