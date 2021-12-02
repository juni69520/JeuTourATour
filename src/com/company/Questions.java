package com.company;

import java.util.List;
import java.util.Scanner;

public class Questions {
    String theme;
    String difficulte;
    String type;
    String question;
    String reponse;
    public List<Questions> questions;

    public Questions(){}

    public Questions(String theme, String difficulte, String type, String question, String reponse){
        this.theme = theme;
        this.difficulte = difficulte;
        this.type = type;
        this.question = question; //"Couleur de la pomme ? a : violet \n b : bleu \n c : rose \n d : rouge";
        this.reponse = reponse; //"rouge";
    }

    public void questionSimple(String phaseNumber, Players players, List allThemes, Questions[] questions, Scanner scanner){
        System.out.println(phaseNumber + " phase");
        System.out.println("");

        List<Players> activePlayers = players.getActivePlayers();
        for (int i = 0; i < activePlayers.size(); i++) {
            System.out.println("À " + activePlayers.get(i).getName() + " de jouer");
            System.out.println("Thème : " + allThemes.get(i));
            System.out.println(questions[i].question);
            String reponse = scanner.nextLine();

            if(reponse.equals(questions[i].reponse)){
                System.out.println("Réponse juste, +2 pts");
                activePlayers.get(i).updateScore(2);
            }else{
                System.out.println("Réponse fausse, la bonne réponse était : "+ questions[i].reponse);
            }
            System.out.println("");
        }

        players.deletePlayer(activePlayers);
    }

    public void questionDouble(String phaseNumber, Players players, List allThemes, Questions[] questions, Scanner scanner, int points){
        System.out.println(phaseNumber + " phase");
        System.out.println("");

        List<Players> activePlayers = players.getActivePlayers();
        int j = 0;
        for (int i = 0; i < activePlayers.size(); i++) {
            System.out.println("À " + activePlayers.get(i).getName() + " de jouer");
            System.out.println("Thème : " + allThemes.get(i));
            System.out.println(questions[j].question);
            String reponse = scanner.nextLine();

            if(reponse.equals(questions[j].reponse)){
                System.out.println("Réponse juste, +" + points + "pts");
                activePlayers.get(i).updateScore(points);
            }else{
                System.out.println("Réponse fausse, la bonne réponse était : "+ questions[j].reponse);
            }
            System.out.println("");
            j+=1;

            System.out.println(questions[j].question);
            String reponseDeux = scanner.nextLine();

            if(reponseDeux.equals(questions[j].reponse)){
                System.out.println("Réponse juste, +" + points + "pts");
                activePlayers.get(i).updateScore(points);
            }else{
                System.out.println("Réponse fausse, la bonne réponse était : "+ questions[j].reponse);
            }
            j+=1;
        }

        players.deletePlayer(activePlayers);
    }
}

