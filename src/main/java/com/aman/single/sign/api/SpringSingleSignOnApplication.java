package com.aman.single.sign.api;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SpringSingleSignOnApplication {
	
	@GetMapping("/login")
	public String welcome2user(Principal principal) {
		return "Hi  "+principal.getName()+ "  welcome to Aman ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSingleSignOnApplication.class, args);
	}

}
