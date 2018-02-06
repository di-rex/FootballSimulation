/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boutsourcing.test;

import com.boutsourcing.entities.Formation;
import com.boutsourcing.entities.Player;
import com.boutsourcing.entities.Squad;
import com.boutsourcing.entities.SquadPosition;
import com.boutsourcing.entities.Team;
import com.boutsourcing.simulate.Match;
import com.boutsourcing.simulate.MatchFormation;
import com.boutsourcing.simulate.SquadMock;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Duki
 */
public class TestFootballTeam {

    @Test
    public void testIfDefendersArrayIsPopulated() {
        SquadMock.populateSquad();
        Random random = new Random();
        int checkRandomPopulated = random.nextInt(SquadPosition.DEFFENDERS.getNumberOfPlayers());
        Assert.assertNotNull(Squad.INSTANCE.getDefenders()[checkRandomPopulated]);
    }

    @Test
    public void testAllInjuredGoalkeepers() throws Exception {
        SquadMock.populateSquad();
        for (Player player : Squad.INSTANCE.getGoalkeepers()) {
            player.setInjured(true);
        }
        Formation formation = new Formation(4, 4, 2);
        Team team = MatchFormation.createTeam(formation, false);
        Player goalkeeper = null;
        for (Player player : team.getMatchTeam()) {
            if (player.getPosition() == SquadPosition.GOALKEEPERS) {
                goalkeeper = player;
            }
        }

        Assert.assertNull(goalkeeper);
    }

    @Test
    public void testIfPlayerIsInjuredInMatch() throws Exception {
        SquadMock.populateSquad();

        Formation formation = new Formation(4, 4, 2);
        Match.play(formation, false);
        boolean isInjured = false;
        for (Player player : Squad.INSTANCE.getAttackers()) {
            if (player.isInjured()) {
                isInjured = true;
            }
        }
        if (!isInjured) {
            for (Player player : Squad.INSTANCE.getMidfielders()) {
                if (player.isInjured()) {
                    isInjured = true;
                }
            }
        }
        if (!isInjured) {
            for (Player player : Squad.INSTANCE.getDefenders()) {
                if (player.isInjured()) {
                    isInjured = true;
                }
            }
        }
        if (!isInjured) {
            for (Player player : Squad.INSTANCE.getGoalkeepers()) {
                if (player.isInjured()) {
                    isInjured = true;
                }
            }
        }

        Assert.assertEquals(true, isInjured);
    }

}
