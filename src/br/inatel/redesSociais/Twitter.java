package br.inatel.redesSociais;

public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos, String nomeDaRede) {
        super(senha, numAmigos, nomeDaRede);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Twitter!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando no Twitter!");
    }
}
