package poodesafio.telefone;

import poodesafio.telefone.nav.Navegador;
import poodesafio.telefone.reprodutormusical.TocadorDeMusica;

public class TelefoneApp {
    private TocadorDeMusica player;
    private Ligacao ligacao;
    private Navegador navegador;

    public TelefoneApp () {
        player = new TocadorDeMusica();
        ligacao = new Ligacao(player);
        navegador = new Navegador();

    }

    public void telefone() {
        player.selecionarMusica("Guns n' Roses - November Rain");
        player.tocar();

        ligacao.ligarPara("996213636");
        ligacao.ligar();

        navegador.abrirNavegador();
        navegador.abrirNavegador();
        navegador.adicionarNovaAba("gmail");
        navegador.adicionarNovaAba("youtube");
        navegador.adicionarNovaAba("google");
        navegador.adicionarNovaAba("facebook");
        navegador.adicionarNovaAba("g1");
        navegador.fecharAba();
        navegador.fecharAba();
        navegador.exibirPagina();
        navegador.fecharAba();
        navegador.fecharAba();
        navegador.atualizarPagina();
        navegador.fecharAba();
        navegador.fecharAba();


    }
}
