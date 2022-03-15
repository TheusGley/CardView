package com.teste.cardview.Model;

import android.widget.ImageView;

public class PostagemC {

    private String nome, legenda;
    private int imagem;

    public PostagemC (){};

    public PostagemC(String nome, String legenda, int imagem) {
        this.nome = nome;
        this.legenda = legenda;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
