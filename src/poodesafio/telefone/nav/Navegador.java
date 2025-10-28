package poodesafio.telefone.nav;

public class Navegador {

    private String[] abas = new String[10];
    private int abasAbertas = 0;
    private boolean navegadorAberto;

    public void abrirNavegador() {
        if (navegadorAberto) {
            System.out.println("Navegador já está aberto");
            return;
        }
        navegadorAberto = true;
    }

    public void exibirPagina() {
        if (!navegadorAberto) {
            System.out.println("Navegador fechado");
            return;
        }

        String abaAberta = abas[abasAbertas - 1];
        System.out.println("VocÊ está na pagina do " + abaAberta);
    }

    public void adicionarNovaAba(String nomeAba) {
        if (!navegadorAberto) {
            System.out.println("Navegador fechado");
            return;
        } else if (abasAbertas < abas.length) {
            abas[abasAbertas] = nomeAba;
            abasAbertas++;
            System.out.println("Aba aberta: " + nomeAba);
        } else {
            System.out.println("Limite de abas atingido");
        }

    }

    public void fecharAba() {
        if (!navegadorAberto) {
            System.out.println("Navegador fechado");
            return;
        } else if (abasAbertas == 0) {
            System.out.println("Não há abas para fechar");
            return;
        } else if (abasAbertas > 0) {
            abasAbertas--;
            String abafechada = abas[abasAbertas];
            abas[abasAbertas] = null;
            System.out.println("Aba fechada: " + abafechada);
        }

    }

    public void atualizarPagina() {
        if (!navegadorAberto) {
            System.out.println("Navegador fechado");
            return;
        }
        if (abasAbertas == 0) {
            System.out.println("Não há abas para atualizar");
            return;
        }
        System.out.println("Página '" + abas[abasAbertas - 1] + "' atualizada!");
    }
}
