package br.inatel.redesSociais;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;
    protected String nomeDaRede;

    public RedeSocial(String senha, int numAmigos, String nomeDaRede) {

    }

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação!!");
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();
}
