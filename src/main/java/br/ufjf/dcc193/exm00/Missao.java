package br.ufjf.dcc193.exm00;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value = "prototype")
public class Missao {

    public Missao() {
        System.out.println("Nova missão!");
    }
	public void resover() {
        System.out.println("Missão resolvida");
	}


}
