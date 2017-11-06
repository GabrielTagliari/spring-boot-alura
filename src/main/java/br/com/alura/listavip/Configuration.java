package br.com.alura.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"br.com.alura"})
public class Configuration {
	
	public static void main(String[] args) {
		SpringApplication.run(Configuration.class, args);
	}

}
