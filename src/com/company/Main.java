package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Themes themes = new Themes();
        Players players = new Players();
        Scanner clavier = new Scanner(System.in);

        players.setNumberOfActivePlayers(4);
        List allThemes = themes.getThemes();

        Questions question = new Questions();
        Questions[] questions = {
                new Questions("fruit","facile", "QCM", "Couleur de la pomme ? a : violet - b : bleu - c : rose - d : rouge", "d"),
                new Questions("Géographie","facile", "QCM", "Capital de la france ? a : Luxembourg - b : Singapour - c : Paris - d : Londres", "c"),
                new Questions("Entertainment","facile", "QCM", "Combien Barbamama et Barbapapa ont-ils d'enfants ? ? a : 5 - b : 6 - c : 78 - d : 7", "d"),
                new Questions("Arts & Literature","facile", "VF", "Victor Hugo est il célèbre ? a : oui - b : non", "a"),
        };
        question.questionSimple("Première", players, allThemes, questions, clavier);

        Questions [] questionsMoyen = {
                new Questions("fruit","moyen", "VF", "Le citron est il acide ? a : oui - b : non", "a"),
                new Questions("fruit","moyen", "QCM", "Quel est l'aliment qui est à la fois fruit et légume ? a : La salade - b : La tomate - c : Le comcombre - d : Le melon", "b"),
                new Questions("Géographie","moyen", "QCM", "Capital de liechtenstein ? a : Luxembourg - b : Vaduz - c : Paris - d : Londres", "b"),
                new Questions("Géographie","moyen", "QCM", "Quel est le plus grand océan du monde ? a : Le Pacifique - b : L'Atlantique - c : Indien - d : La Méditerranée", "a"),
                new Questions("Entertainment","moyen", "QCM", "Combien y a t il de teletubbies ? a : 5 - b : 6 - c : 7 - d : 8", "d"),
                new Questions("Entertainment","moyen", "QCM", "Quel pays détient le plus de rond point ? a : France - b : US - c : Allemagne - d : Espagne", "a"),
                new Questions("Arts & Literature","moyen", "VF", "Le prix Goncourt 2021 a t'il été attribué à Mohamed Mbougar Sarr ? a : oui - b : non", "a"),
                new Questions("Arts & Literature","moyen", "VF", "Marcel Proust est il né avant Charles Baudelaire ? a : oui - b : non", "a"),
                new Questions("Science & Nature","moyen", "VF", "Le dromadaire a t'il plus de bosse que le chameau ? a : oui - b : non", "a"),
                new Questions("Science & Nature","moyen", "VF", "L'astate est il le matériau le plus rare au monde ? a : oui - b : non", "a"),
                new Questions("Sport","moyen", "QCM", "La longueur d'un stade de foot est comprie entre : a : 90 - 120m - b : 80 - 110m - c : 100 - 130m - d : 110 - 140m", "a"),
                new Questions("Sport","moyen", "QCM", "Avec combien de point d'écart l'équipe de France a t'elle gagné son dernier match contre les All Blacks : a : 17 - b : 20 - c : 25 - d : 32", "c"),

        };
        question.questionDouble("Deuxième", players, allThemes, questionsMoyen, clavier, 3);

        Questions [] questionsHard = {
                new Questions("fruit","difficile", "QCM", "D'où sont originaire les bananes ? a : Europe - b : Amérique - c : Asie - d : Afrique", "c"),
                new Questions("fruit","difficile", "VF", "Les premières carottes à voir le jour n’étaient pas orangées. ? a : Vrai - b : Faux", "a"),
                new Questions("Géographie","difficile", "QCM", "Capital du Sri-Lanka ? a : Sri Jayawardenapura - b : Singapour - c : Paris - d : Londres", "a"),
                new Questions("Géographie","difficile", "QCM", "Dans quelle ville italienne se trouve la tour Pirelli ? a : Milan - b : Florence - c : Turin - d : Rome", "a"),
                new Questions("Entertainment","difficile", "QCM", "Combien y a t il de génération pokémon ? ? a : 5 - b : 6 - c : 7 - d : 8", "d"),
                new Questions("Entertainment","difficile", "QCM", "Quelle armée élève des pigeons voyageurs ? a : Allemange - b : France - c : Angleterre - d : Italie", "b"),
        };
        question.questionDouble("Troisième", players, allThemes, questionsHard, clavier, 5);

        System.out.println(players.activePlayers.get(0).getName() + ", tu es la gagnant");
    }
}
