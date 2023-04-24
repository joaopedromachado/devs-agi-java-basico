package jogoadivinha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        String[][] quiz = {
                {"Qual é a linguagem de programação mais usada atualmente?\n a) Java \n b) Python \n c) C++ \n d) JavaScript \n e) PHP", "b"},
                {"Qual empresa desenvolveu o sistema operacional Android?\n a) Apple \n b) Google \n c) Microsoft \n d) IBM \n e) Samsung", "b"},
                {"Qual é o nome da técnica de otimização de motores de busca que consiste em melhorar a posição de um site nos resultados de pesquisa?\n a) SEO \n b) SEM \n c) SMO \n d) SMM \n e) SMI", "a"},
                {"Qual é o nome do protocolo de segurança que criptografa as conexões entre um navegador e um servidor?\n a) HTTPS \n b) FTP \n c) SMTP \n d) POP3 \n e) IMAP", "a"},
                {"Qual é o nome da técnica de inteligência artificial que consiste em treinar um modelo com exemplos rotulados para que ele possa fazer previsões com novos dados?\n a) Aprendizado supervisionado \n b) Aprendizado não supervisionado \n c) Aprendizado por reforço \n d) Aprendizado semi-supervisionado \n e) Aprendizado ativo", "a"},
                {"Qual é o nome da rede social de fotos que foi adquirida pelo Facebook em 2012?\n a) Twitter \n b) Instagram \n c) Snapchat \n d) Pinterest \n e) Tiktok", "b"},
                {"Qual é o nome do assistente virtual da Amazon que responde a comandos de voz?\n a) Siri \n b) Alexa \n c) Cortana \n d) Google Assistant \n e) Bixby", "b"},
                {"Qual é o nome da tecnologia de armazenamento em nuvem da Apple?\n a) iCloud \n b) OneDrive \n c) Google Drive \n d) Dropbox \n e) Mega", "a"},
                {"Qual é o nome da linguagem de programação utilizada para criar páginas web dinâmicas?\n a) Python \n b) Java \n c) PHP \n d) Ruby \n e) Swift", "c"},
                {"Qual é o nome do navegador de internet desenvolvido pela Mozilla?\n a) Chrome \n b) Safari \n c) Edge \n d) Firefox \n e) Opera", "d"}
        };

        for (int i = 0 ; i < quiz.length ; i++){
            System.out.println(quiz[i][0]);
            System.out.print("Resposta: ");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase(quiz[i][1])) {
                System.out.println("Correto!");
                score++;
            } else {
                System.out.println("Incorreto.");
            }
        }

        System.out.println("Quiz completo! Você acertou " + score + " de " + quiz.length + " perguntas.");
    }
}
