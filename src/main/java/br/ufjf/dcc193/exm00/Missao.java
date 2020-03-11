package br.ufjf.dcc193.exm00;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value = "prototype")
public class Missao {
    private Hero heroi;

    public Missao() {
        System.out.println("Nova missão!");
    }
    public void setHeroi(Hero novoHeroi)
    {
        this.heroi = novoHeroi;
    }
	public void resover() {
        System.out.println(heroi.getNome() + " destruiu a missão!");
	}


}
