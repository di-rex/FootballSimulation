package com.boutsourcing.entities;

import java.util.Arrays;

/**
 * singleton enum describing squad of all players
 *
 * @author Duki
 */
public enum Squad {

    INSTANCE;

    private Player[] goalkeepers;
    private Player[] defenders;
    private Player[] midfielders;
    private Player[] attackers;

    Squad() {
        this.goalkeepers = new Player[SquadPosition.GOALKEEPERS.getNumberOfPlayers()];
        this.defenders = new Player[SquadPosition.DEFFENDERS.getNumberOfPlayers()];
        this.midfielders = new Player[SquadPosition.MIDFIELDERS.getNumberOfPlayers()];
        this.attackers = new Player[SquadPosition.ATTACKERS.getNumberOfPlayers()];
    }

    public Player[] getGoalkeepers() {
        return goalkeepers;
    }

    public void setGoalkeepers(Player[] goalkeepers) {
        this.goalkeepers = goalkeepers;
    }

    public Player[] getDefenders() {
        return defenders;
    }

    public void setDefenders(Player[] defenders) {
        this.defenders = defenders;
    }

    public Player[] getMidfielders() {
        return midfielders;
    }

    public void setMidfielders(Player[] midfielders) {
        this.midfielders = midfielders;
    }

    public Player[] getAttackers() {
        return attackers;
    }

    public void setAttackers(Player[] attackers) {
        this.attackers = attackers;
    }

    public void writeAllPlayers() {
        for (Player p : this.getGoalkeepers()) {
            System.out.println(p.toString());
        }
        for (Player p : this.getDefenders()) {
            System.out.println(p.toString());
        }
        for (Player p : this.getMidfielders()) {
            System.out.println(p.toString());
        }
        for (Player p : this.getAttackers()) {
            System.out.println(p.toString());
        }
    }

  
}
