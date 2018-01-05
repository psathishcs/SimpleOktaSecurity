package org.hello.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SimpleOktaSecurityApplication {
	public static void main(String args[]) throws Exception {
		SpringApplication.run(SimpleOktaSecurityApplication.class, args);
	}
	
}
