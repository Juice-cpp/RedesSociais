package br.inatel.redesSociais;

import java.util.Set;
import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais;

    public Usuario(RedeSocial[] redesSociais, String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = new HashSet<RedeSocial>();

        for(RedeSocial r : redesSociais) {
            this.redesSociais.add(r);
        }
    }

    public Set<RedeSocial> getRedesSociais() {
        return redesSociais;
    }

    public String getNome() {
        return nome;
    }

}
