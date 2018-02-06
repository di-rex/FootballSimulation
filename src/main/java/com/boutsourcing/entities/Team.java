package com.boutsourcing.entities;

import java.util.Arrays;

/**
 * class describing team for the game
 *
 * @author Duki
 */
public class Team {

    private int teamQuality;
    private Formation formation;
    private Player[] matchTeam;

    public int getTeamQuality() {
        return teamQuality;
    }

    public void setTeamQuality(int teamQuality) {
        this.teamQuality = teamQuality;
    }

    public Player[] getMatchTeam() {
        return matchTeam;
    }

    public void setMatchTeam(Player[] matchTeam) {
        this.matchTeam = matchTeam;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.teamQuality;
        hash = 97 * hash + Arrays.deepHashCode(this.matchTeam);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (this.teamQuality != other.teamQuality) {
            return false;
        }
        if (!Arrays.deepEquals(this.matchTeam, other.matchTeam)) {
            return false;
        }
        return true;
    }

    public Team(Player[] matchTeam) {
        this.matchTeam = matchTeam;
        int avgQuality;
        int sumQuality = 0;
        for (Player player : this.matchTeam) {
            sumQuality = sumQuality + player.getQuality();
        }
        avgQuality = sumQuality / matchTeam.length;
        this.teamQuality = avgQuality;
    }

}
