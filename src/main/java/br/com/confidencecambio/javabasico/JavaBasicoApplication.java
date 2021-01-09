package br.com.confidencecambio.javabasico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.confidencecambio.javabasico.model.Individuo;

@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(JavaBasicoApplication.class, args);
		
		System.out.println(new Individuo("João Soares Silva").getShortName());
		
	}

}
