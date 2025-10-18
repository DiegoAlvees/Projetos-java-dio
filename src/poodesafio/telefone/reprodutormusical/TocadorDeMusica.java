package poodesafio.telefone.reprodutormusical;

public class TocadorDeMusica {
    private String musicaAtual;
    private boolean tocando;

    public void selecionarMusica( String musica) {
        this.musicaAtual = musica;
        System.out.println("Musica escolhida " + musica);
    }


    public void tocar() {
        if(musicaAtual == null || musicaAtual.isEmpty()) {
            System.out.println("Nenhuma musica selecionada");
            return;
        }
        tocando = true;
        System.out.println("A musica " + musicaAtual + " está tocando" );
    }

    public void pausar() {
        if(!tocando) {
            return;
        }  else {
            tocando = false;
            System.out.println("Musica pausada");
        }

    }
  

    
    
}