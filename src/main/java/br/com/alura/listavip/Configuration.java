package br.com.alura.listavip;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication(scanBasePackages = {"br.com.alura"})
public class Configuration {
	
	public static void main(String[] args) {
		SpringApplication.run(Configuration.class, args);
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/listavip?useSSL=false");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
}
