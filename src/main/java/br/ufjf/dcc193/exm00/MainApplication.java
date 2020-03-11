package br.ufjf.dcc193.exm00;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto =
		 SpringApplication.run(MainApplication.class, args);
		System.out.println("Hello World");

		Missao m1 = contexto.getBean(Missao.class);
		m1.resover();

		Missao m2 = contexto.getBean(Missao.class);
		m2.resover();
	}
}
