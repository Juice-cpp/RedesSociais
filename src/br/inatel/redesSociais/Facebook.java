package br.inatel.redesSociais;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos, String nomeDaRede) {
        super(senha, numAmigos, nomeDaRede);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando com seus amigos no Facebook!");
    }
}
