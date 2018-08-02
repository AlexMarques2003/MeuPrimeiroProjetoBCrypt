package com.alexmarques2003.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alexmarques2003.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoBcryptApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoBcryptApplication.class, args);
	}	
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encoded:" + senhaEncoded);
			System.out.println("Senha válida:" + SenhaUtils.senhaValida("123456",senhaEncoded));
		};
	}
}
