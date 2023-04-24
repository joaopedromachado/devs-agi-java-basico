package modelos;

import java.util.Scanner;

public class StartGameQuiz {
    Jogador player1 = new Jogador("João", 0);

    Quiz quiz = new Quiz(player1);
    Scanner scanner = new Scanner(System.in);
    private int counter=0;



    public void run(){
        do {
            quiz.exibirPerguntaQuiz();
            String resposta = scanner.nextLine();
            quiz.validarResposta(resposta);
            counter++;
        }while(counter < quiz.getQuizColumnsLength());

        System.out.println("Quiz completo! Você acertou " + player1.getScore() + " de " + quiz.getQuizColumnsLength() + " perguntas.");
        player1.calcularMediaJogador();
        System.out.println(player1.getNome());
    }
}
