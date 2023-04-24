package modelos;

import medias.MediaScoreboard;
import medias.Scoreboard;

public class Jogador implements Scoreboard, MediaScoreboard {
    private String nome;
    private int score;

    public Jogador(String nome, int score) {
        this.nome = nome;
        this.score = score;
    }


    public String getNome() {
        return nome;
    }


    @Override
    public void atualizarScore(int score) {
        this.score += score;
    }

    @Override
    public int getScore(){
        return this.score;
    }


    @Override
    public void calcularMediaJogador() {
        if (this.score >= 8){
            System.out.printf("Excelente! Você tirou nota %d", this.score);
        } else if (this.score < 8 && this.score >= 5) {
            System.out.printf("Boa! Você tirou nota %d", this.score);
        }else {
            System.out.printf("Que pena! Vai estudar, sua nota foi %d", this.score);
        }
    }
}
