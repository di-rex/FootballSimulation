/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boutsourcing.simulate;

import com.boutsourcing.entities.Formation;
import com.boutsourcing.entities.Player;
import com.boutsourcing.entities.Squad;
import com.boutsourcing.entities.Team;

/**
 * class describing match
 *
 * @author Duki
 */
public class Match {

    public static void play(Formation formation, boolean strongerOpponent) throws Exception {

        System.out.println("------------------------------------------");

        Squad.INSTANCE.writeAllPlayers();

        Team team = MatchFormation.createTeam(formation, strongerOpponent);
        for (Player p : team.getMatchTeam()) {
            System.out.println("NUMBER " + p.getNumber() + "  QUALITY " + p.getQuality() + "  POSITION " + p.getPosition());
        }

        Injury.simulateInjury(team.getMatchTeam());
    }
}
