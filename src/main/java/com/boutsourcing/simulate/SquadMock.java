/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boutsourcing.simulate;

import com.boutsourcing.entities.Player;
import com.boutsourcing.entities.Squad;
import com.boutsourcing.entities.SquadPosition;
import java.util.Arrays;

/**
 *
 * @author Duki
 */
public class SquadMock {

    public static void populateSquad() {
        populateGoalkeepers();
        populateDefenders();
        populateAttackers();
        populateMidfielders();
    }

    private static void populateGoalkeepers() {
        Player firstGoalkeeper = new Player();
        firstGoalkeeper.setInjured(false);
        firstGoalkeeper.setPosition(SquadPosition.GOALKEEPERS);
        firstGoalkeeper.setQuality(85);
        firstGoalkeeper.setSpeed(75);
        firstGoalkeeper.setNumber(1);

        Player secondGoalkeeper = new Player();
        secondGoalkeeper.setInjured(false);
        secondGoalkeeper.setPosition(SquadPosition.GOALKEEPERS);
        secondGoalkeeper.setQuality(82);
        secondGoalkeeper.setSpeed(73);
        secondGoalkeeper.setNumber(12);

        Player[] goalKeepers = new Player[SquadPosition.GOALKEEPERS.getNumberOfPlayers()];
        goalKeepers[0] = firstGoalkeeper;
        goalKeepers[1] = secondGoalkeeper;
        Arrays.sort(goalKeepers, (Player playerOne, Player playerTwo) -> {
            return Integer.signum(playerTwo.getQuality() - playerOne.getQuality()
            );
        }
        );
        Squad.INSTANCE.setGoalkeepers(goalKeepers);
    }

    private static void populateDefenders() {
        Player firstDefender = new Player();
        firstDefender.setInjured(false);
        firstDefender.setPosition(SquadPosition.DEFFENDERS);
        firstDefender.setQuality(85);
        firstDefender.setSpeed(80);
        firstDefender.setNumber(2);

        Player secondDefender = new Player();
        secondDefender.setInjured(false);
        secondDefender.setPosition(SquadPosition.DEFFENDERS);
        secondDefender.setQuality(82);
        secondDefender.setSpeed(73);
        secondDefender.setNumber(3);

        Player thirdDefender = new Player();
        thirdDefender.setInjured(false);
        thirdDefender.setPosition(SquadPosition.DEFFENDERS);
        thirdDefender.setQuality(85);
        thirdDefender.setSpeed(75);
        thirdDefender.setNumber(4);

        Player forthDefender = new Player();
        forthDefender.setInjured(false);
        forthDefender.setPosition(SquadPosition.DEFFENDERS);
        forthDefender.setQuality(82);
        forthDefender.setSpeed(73);
        forthDefender.setNumber(5);

        Player fifthDefender = new Player();
        fifthDefender.setInjured(false);
        fifthDefender.setPosition(SquadPosition.DEFFENDERS);
        fifthDefender.setQuality(78);
        fifthDefender.setSpeed(82);
        fifthDefender.setNumber(13);

        Player sixthDefender = new Player();
        sixthDefender.setInjured(false);
        sixthDefender.setPosition(SquadPosition.DEFFENDERS);
        sixthDefender.setQuality(82);
        sixthDefender.setSpeed(79);
        sixthDefender.setNumber(14);

        Player[] defenders = new Player[SquadPosition.DEFFENDERS.getNumberOfPlayers()];
        defenders[0] = firstDefender;
        defenders[1] = secondDefender;
        defenders[2] = thirdDefender;
        defenders[3] = forthDefender;
        defenders[4] = fifthDefender;
        defenders[5] = sixthDefender;
        Arrays.sort(defenders, (Player playerOne, Player playerTwo) -> {
            return Integer.signum(playerTwo.getQuality() - playerOne.getQuality()
            );
        }
        );
        Squad.INSTANCE.setDefenders(defenders);
    }

    private static void populateMidfielders() {
        Player firstMidfielder = new Player();
        firstMidfielder.setInjured(false);
        firstMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        firstMidfielder.setQuality(85);
        firstMidfielder.setSpeed(82);
        firstMidfielder.setNumber(6);

        Player secondMidfilder = new Player();
        secondMidfilder.setInjured(false);
        secondMidfilder.setPosition(SquadPosition.MIDFIELDERS);
        secondMidfilder.setQuality(88);
        secondMidfilder.setSpeed(87);
        secondMidfilder.setNumber(7);

        Player thirdMidfielder = new Player();
        thirdMidfielder.setInjured(false);
        thirdMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        thirdMidfielder.setQuality(85);
        thirdMidfielder.setSpeed(89);
        thirdMidfielder.setNumber(8);

        Player forthMidfielder = new Player();
        forthMidfielder.setInjured(false);
        forthMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        forthMidfielder.setQuality(85);
        forthMidfielder.setSpeed(83);
        forthMidfielder.setNumber(15);

        Player fifthMidfielder = new Player();
        fifthMidfielder.setInjured(false);
        fifthMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        fifthMidfielder.setQuality(80);
        fifthMidfielder.setSpeed(82);
        fifthMidfielder.setNumber(16);

        Player sixthMidfielder = new Player();
        sixthMidfielder.setInjured(false);
        sixthMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        sixthMidfielder.setQuality(78);
        sixthMidfielder.setSpeed(82);
        sixthMidfielder.setNumber(17);

        Player seventhMidfielder = new Player();
        seventhMidfielder.setInjured(false);
        seventhMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        seventhMidfielder.setQuality(90);
        seventhMidfielder.setSpeed(82);
        seventhMidfielder.setNumber(18);

        Player eightMidfielder = new Player();
        eightMidfielder.setInjured(false);
        eightMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        eightMidfielder.setQuality(88);
        eightMidfielder.setSpeed(84);
        eightMidfielder.setNumber(19);

        Player ninethMidfielder = new Player();
        ninethMidfielder.setInjured(false);
        ninethMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        ninethMidfielder.setQuality(66);
        ninethMidfielder.setSpeed(85);
        ninethMidfielder.setNumber(20);

        Player tenthMidfielder = new Player();
        tenthMidfielder.setInjured(false);
        tenthMidfielder.setPosition(SquadPosition.MIDFIELDERS);
        tenthMidfielder.setQuality(94);
        tenthMidfielder.setSpeed(85);
        tenthMidfielder.setNumber(21);

        Player[] midfielders = new Player[SquadPosition.MIDFIELDERS.getNumberOfPlayers()];
        midfielders[0] = firstMidfielder;
        midfielders[1] = secondMidfilder;
        midfielders[2] = thirdMidfielder;
        midfielders[3] = forthMidfielder;
        midfielders[4] = fifthMidfielder;
        midfielders[5] = sixthMidfielder;
        midfielders[6] = seventhMidfielder;
        midfielders[7] = eightMidfielder;
        midfielders[8] = ninethMidfielder;
        midfielders[9] = tenthMidfielder;

        Arrays.sort(midfielders, (Player playerOne, Player playerTwo) -> {
            return Integer.signum(playerTwo.getQuality() - playerOne.getQuality()
            );
        }
        );
        Squad.INSTANCE.setMidfielders(midfielders);
    }

    private static void populateAttackers() {

        Player firstAttacker = new Player();
        firstAttacker.setInjured(false);
        firstAttacker.setPosition(SquadPosition.ATTACKERS);
        firstAttacker.setQuality(90);
        firstAttacker.setSpeed(85);
        firstAttacker.setNumber(9);

        Player secondAttacker = new Player();
        secondAttacker.setInjured(false);
        secondAttacker.setPosition(SquadPosition.ATTACKERS);
        secondAttacker.setQuality(88);
        secondAttacker.setSpeed(88);
        secondAttacker.setNumber(10);

        Player thirdAttacker = new Player();
        thirdAttacker.setInjured(false);
        thirdAttacker.setPosition(SquadPosition.ATTACKERS);
        thirdAttacker.setQuality(84);
        thirdAttacker.setSpeed(86);
        thirdAttacker.setNumber(11);

        Player forthAttacker = new Player();
        forthAttacker.setInjured(false);
        forthAttacker.setPosition(SquadPosition.ATTACKERS);
        forthAttacker.setQuality(87);
        forthAttacker.setSpeed(92);
        forthAttacker.setNumber(22);

        Player[] attackers = new Player[SquadPosition.ATTACKERS.getNumberOfPlayers()];
        attackers[0] = firstAttacker;
        attackers[1] = secondAttacker;
        attackers[2] = thirdAttacker;
        attackers[3] = forthAttacker;

        Squad.INSTANCE.setAttackers(attackers);
    }
}
