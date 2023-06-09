package br.com.fernandes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.com.fernandes.entity")
public class TarefaGeniusApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarefaGeniusApplication.class, args);
	}

}
