package br.inatel.redesSociais;

import br.inatel.excecoes.SenhaErradoException;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;
    protected String nomeDaRede;

    public RedeSocial(String senha, int numAmigos, String nomeDaRede) {
        try {
            if(senha != "Junin123") {
                throw new SenhaErradoException("Senha Inválida.");
            }
        } catch (SenhaErradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação!!");
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();
}
