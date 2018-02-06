
package com.boutsourcing.entities;

/**
 * codebook enum - describing positions and number of players in the squad by
 * position
 *
 * @author Duki
 */
public enum SquadPosition {

    GOALKEEPERS(2),
    DEFFENDERS(6),
    MIDFIELDERS(10),
    ATTACKERS(4);

    int numberOfPlayers;

    private SquadPosition(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

}
