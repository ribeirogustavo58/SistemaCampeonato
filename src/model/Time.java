package model;

public class Time {

    private String nome;
    private String jogo;
    private String capitao;
    private int jogadores;
    private int vitorias;
    private int derrotas;
    private int pontos;

    public Time(String nome, String jogo,
                String capitao, int jogadores) {

        this.nome = nome;
        this.jogo = jogo;
        this.capitao = capitao;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public String getJogo() {
        return jogo;
    }

    public String getCapitao() {
        return capitao;
    }

    public int getJogadores() {
        return jogadores;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getPontos() {
        return pontos;
    }

    public void adicionarVitoria() {
        vitorias++;
        pontos += 3;
    }

    public void adicionarDerrota() {
        derrotas++;
    }

    @Override
    public String toString() {
        return nome;
    }
}