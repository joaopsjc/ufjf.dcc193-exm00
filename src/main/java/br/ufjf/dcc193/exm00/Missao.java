package br.ufjf.dcc193.exm00;

import org.springframework.stereotype.Component;
@Component
public class Missao {

    public Missao() {
        System.out.println("Nova missão!");
    }
	public void resover() {
        System.out.println("Missão resolvida");
	}


}
