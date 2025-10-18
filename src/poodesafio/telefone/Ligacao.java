package poodesafio.telefone;

import poodesafio.telefone.evento.EventoSistema;
import poodesafio.telefone.reprodutormusical.TocadorDeMusica;

public class Ligacao implements EventoSistema {

    private TocadorDeMusica player;
    private String numeroSelecionado;
    private boolean chamando = true;
    private int numeroChamadas = 2;

    public Ligacao(TocadorDeMusica player) {
        this.player = player;
    }

    public void ligarPara(String numeroSelecionado) {
        this.numeroSelecionado = numeroSelecionado;
        System.out.println("Escolhendo " + numeroSelecionado);
    }

    public void ligar() {
        if (numeroSelecionado == null || numeroSelecionado.isEmpty()) {
            System.out.println("Nenhum numero selecionado");
            return;
        }
        System.out.println("Ligando para " + numeroSelecionado);
        executarEvento();

        boolean atendida = false;

        for (numeroChamadas = 1; numeroChamadas <= 3; numeroChamadas++) {
            chamando = true;
            System.out.println("Chamando, numero de tentativas " + numeroChamadas);

            if (Math.random() < 0.3) {
                atender();
                atendida = true;
                break;
            }
        }
        if (!atendida) {
            System.out.println("Correio de voz: deixe sua mensagem");
        }
    }

    public void atender() {
        if (!chamando) {
            System.out.println("Nenhuma ligação para atender");
        } else {

            executarEvento();
            System.out.println("Ligação atendida");
        }
    }

    public void executarEvento() {
        player.pausar();
    }

}
