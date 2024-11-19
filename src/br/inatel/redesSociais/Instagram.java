package br.inatel.redesSociais;

public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos, String nomeDaRede) {
        super(senha, numAmigos, nomeDaRede);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando no Instagram!");
    }
}
