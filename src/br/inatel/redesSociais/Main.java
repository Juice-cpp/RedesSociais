package br.inatel.redesSociais;

import br.inatel.excecoes.RedeSocialNaoEncontradaException;

public class Main {
    public static void main(String[] args) {

        Facebook fb = new Facebook("Junin123", 127, "Facebook");
        GooglePlus gp = new GooglePlus("Junin123", 23, "Google Plus");
        Twitter tt = new Twitter("Junin123", 96, "Twitter");
        Instagram ig = new Instagram("Junin123", 667, "Instagram");


        RedeSocial[] redesSociais = new RedeSocial[4];
        redesSociais[0] = tt;
        redesSociais[1] = fb;
        redesSociais[2] = ig;
        redesSociais[3] = gp;


        Usuario usuario = new Usuario(redesSociais, "Junin", "junin.balatensa@gmail.com");

        int contador = 0;
        for (RedeSocial redeSocial : usuario.getRedesSociais()) {
            try {
                if (redeSocial instanceof Facebook) {
                    ((Facebook) redeSocial).fazStreaming();
                    ((Facebook) redeSocial).postarFoto();
                    ((Facebook) redeSocial).postarComentario();
                } else if (redeSocial instanceof Twitter) {
                    ((Twitter) redeSocial).compartilhar();
                    ((Twitter) redeSocial).curtirPublicacao();
                    ((Twitter) redeSocial).postarVideo();
                } else {
                    throw new RedeSocialNaoEncontradaException("Rede social não encontrada");
                }
            } catch (RedeSocialNaoEncontradaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

    }
}