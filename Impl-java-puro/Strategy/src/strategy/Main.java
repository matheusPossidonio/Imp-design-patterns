package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Comportamento comportamentoAtaque = new ImplComportamentoAtaque();
        Comportamento comportamentoBasico = new ImplComportamentoBasico();
        Comportamento comportamentoDefesa = new ImplComportamentoDefesa();

        Robo robozinho = new Robo();
        robozinho.setComportamento(comportamentoAtaque);
        robozinho.mover();
        robozinho.setComportamento(comportamentoBasico);
        robozinho.mover();
        robozinho.setComportamento(comportamentoDefesa);
        robozinho.mover();

        System.out.println("-------------------------------------------------------");

        List<Comportamento> arsenalRobo = new ArrayList<Comportamento>();
        arsenalRobo.add(comportamentoAtaque);
        arsenalRobo.add(comportamentoBasico);
        arsenalRobo.add(comportamentoDefesa);

        for (Comportamento x : arsenalRobo) 
                x.mover();

        arsenalRobo.set(2, comportamentoDefesa = new ImplComportamentoAtaque());
        for (Comportamento x : arsenalRobo) 
            x.mover();
    } 
}
