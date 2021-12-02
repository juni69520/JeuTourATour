package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Players {
    public List<Players> players = new ArrayList<Players>();
    public List<Players> activePlayers = new ArrayList<Players>();
    public int numero;
    public int score = 0;
    public String name;
    public String state = "pending";

    Players(){
        int numero = 100;
        for(int i = 0; i < 20; i++) {
            players.add(new Players(numero, Helpers.generateRandomName()));
            name+=1;
            numero+=10;
        }
    }

    Players(int numero, String name){
        this.numero = numero;
        this.name = name;
    }

    public List getPlayers(){
        return this.players;
    }

    public void setNumberOfActivePlayers(int NumberActivePlayer) throws Exception {
        if(NumberActivePlayer > 19) {
            throw new Exception("Nombre de joueurs actifs supérieur au nombre de joueurs total (20)");
        }

        final int[] ints = new Random().ints(0, 19).distinct().limit(NumberActivePlayer).toArray();

        for(int i = 0; i < this.players.size(); i++) {
            if(Helpers.contains(ints, i)){
                activePlayers.add(this.players.get(i));
                this.players.get(i).updateState("active");
            }
        }
    }

    public List getActivePlayers() {
        return this.activePlayers;
    }
    public String getName() {
        return this.name;
    }

    public void getPlayerInformation(){
        System.out.println("Player numero = " + this.numero + " Player name = " + this.name + " Player state = " + this.state + "Player score = " + this.score);
    }

    public int getScore(){
        return this.score;
    }

    public void updateScore(int score){
        this.score =+ score;
    }

    public void updateState(String state) {
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public void deletePlayer(List<Players> activePlayers) {
        int storedIndex = 0;
        int storedScore = 1000;
        for (int i = 0; i < activePlayers.size(); i++) {
            if(activePlayers.get(i).getScore() <= storedScore){
                storedIndex = i;
                storedScore = activePlayers.get(i).getScore();
            }
        }
        activePlayers.get(storedIndex).updateState("Lost");
        System.out.println("Le joueur " + activePlayers.get(storedIndex).getName() + " a été éliminé");
        System.out.println("");
        activePlayers.remove(storedIndex);
    }

    public void getWinner(List<Players> activePlayers){

    }
}

