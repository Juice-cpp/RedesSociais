package br.inatel.redesSociais;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos, String nomeDaRede) {
        super(senha, numAmigos, nomeDaRede);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando com seus amigos no Google Plus!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Google Plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Google Plus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando no Google Plus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no Google Plus!");
    }
}
