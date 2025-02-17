package com.perficient.oauth20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * @author vijayakumar.ramu
 *
 */
@SpringBootApplication
@EnableOAuth2Sso
public class OAuth20Application {

	public static void main(String[] args) {
		SpringApplication.run(OAuth20Application.class, args);
	}

}
