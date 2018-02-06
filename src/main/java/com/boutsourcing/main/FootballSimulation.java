/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boutsourcing.main;

import com.boutsourcing.entities.Formation;
import com.boutsourcing.simulate.Match;
import com.boutsourcing.simulate.SquadMock;

/**
 *
 * @author Duki
 */
public class FootballSimulation {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        SquadMock.populateSquad();

        Formation formation = new Formation(5, 4, 1);
        Match.play(formation, true);

        formation = new Formation(4, 4, 2);
        Match.play(formation, false);

        formation = new Formation(3, 4, 3);
        Match.play(formation, false);

    }

}
