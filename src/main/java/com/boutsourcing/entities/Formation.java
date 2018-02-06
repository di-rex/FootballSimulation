
package com.boutsourcing.entities;

/**
 * class describing team formation for the game
 * @author Duki
 */
public class Formation {

    private int numberOfDefenders;
    private int numberOfMidfielders;
    private int numberOfAttackers;

    public int getNumberOfDefenders() {
        return numberOfDefenders;
    }

    public void setNumberOfDefenders(int numberOfDefenders) {
        this.numberOfDefenders = numberOfDefenders;
    }

    public int getNumberOfMidfielders() {
        return numberOfMidfielders;
    }

    public void setNumberOfMidfielders(int numberOfMidfielders) {
        this.numberOfMidfielders = numberOfMidfielders;
    }

    public int getNumberOfAttackers() {
        return numberOfAttackers;
    }

    public void setNumberOfAttackers(int numberOfAttackers) {
        this.numberOfAttackers = numberOfAttackers;
    }

    public Formation(int numberOfDefenders, int numberOfMidfielders, int numberOfAttackers) {
        this.numberOfDefenders = numberOfDefenders;
        this.numberOfMidfielders = numberOfMidfielders;
        this.numberOfAttackers = numberOfAttackers;
    }

}
