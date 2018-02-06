package com.boutsourcing.simulate;

import com.boutsourcing.entities.Formation;
import com.boutsourcing.entities.Player;
import com.boutsourcing.entities.Squad;
import com.boutsourcing.entities.Team;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Methods of this class creating formations according to available players and
 * required Formation
 *
 * @author Duki
 */
public class MatchFormation {

    /**
     *
     * @param formation - team formation for the match
     * @param strongerTeam - is the opposite team stronger than yours
     * @return Team for the match if there is no goalkeeper available (both
     * injured), we are getting one more defensive player than requested if
     * there is no attacker available (injured), we are getting one more
     * defensive player than requested
     * @throws java.lang.Exception
     */
    public static Team createTeam(Formation formation, boolean strongerTeam) throws Exception {
        try {
            int numOfDef = formation.getNumberOfDefenders();
            int numOfMid = formation.getNumberOfMidfielders();
            int numOfAtt = formation.getNumberOfAttackers();

            Player goalkeepers = getGoalkeepers();

            if (goalkeepers == null) {
                numOfDef++;
            }

            Player[] attackers = getAttackers(numOfAtt, strongerTeam);

            if (attackers.length < numOfAtt) {
                numOfMid++;
            }
            Player[] defenders = getDefenders(numOfDef);
            Player[] midfielders = getMidfielders(numOfMid);

            Player[] defence = ArrayUtils.addAll(defenders, goalkeepers);
            Player[] attack = ArrayUtils.addAll(midfielders, attackers);
            Player[] squad = ArrayUtils.addAll(defence, attack);
            Team team = new Team(squad);
            return team;
        } catch (Exception e) {
            throw new Exception("The team cannot be assembled at the moment! ");
        }
    }

    /**
     *
     * @return goalkeeper who is not injured with highest quality
     */
    private static Player getGoalkeepers() {
        Player goalkeeper = null;
        for (Player player : Squad.INSTANCE.getGoalkeepers()) {
            if (!player.isInjured()) {
                goalkeeper = player;
                break;
            }
        }
        return goalkeeper;
    }

    /**
     * get the best non injured defenders by quality
     *
     * @param numberOfDefenders - how many defenders is requested for the game
     * @return array of defenders for the game
     */
    private static Player[] getDefenders(int numberOfDefenders) {

        Stream<Player> stream = Arrays.stream(Squad.INSTANCE.getDefenders());
        List<Player> result = stream.filter(line -> !line.isInjured()).limit(numberOfDefenders).collect(Collectors.toList());
        Player[] defenders = new Player[result.size()];
        defenders = result.toArray(defenders);
        return defenders;
    }

    /**
     * get the best non injured midfielders by quality
     *
     * @param numberOfMidfielders - how many midfielders is requested for the
     * game
     * @return array of midfielders for the game
     */
    private static Player[] getMidfielders(int numberOfMidfielders) {

        Stream<Player> stream = Arrays.stream(Squad.INSTANCE.getMidfielders());
        List<Player> result = stream.filter(line -> !line.isInjured()).limit(numberOfMidfielders).collect(Collectors.toList());
        Player[] midfielders = new Player[result.size()];
        midfielders = result.toArray(midfielders);
        return midfielders;
    }

    /**
     * get the best non injured attackers, depending on speed or quality
     *
     * @param numberOfAttackers - how many attackers is requested for the game
     * @param enemyTeamStronger - if enemy team is stronger, sort attackers by
     * speed
     * @return array of attackers for the game
     */
    private static Player[] getAttackers(int numberOfAttackers, boolean enemyTeamStronger) {
        if (enemyTeamStronger) {
            Arrays.sort(Squad.INSTANCE.getAttackers(), (Player playerOne, Player playerTwo) -> {
                return Integer.signum(playerTwo.getSpeed() - playerOne.getSpeed());
            });
        } else {
            Arrays.sort(Squad.INSTANCE.getAttackers(), (Player playerOne, Player playerTwo) -> {
                return Integer.signum(playerOne.getSpeed() - playerTwo.getSpeed()
                );
            }
            );
        }

        Stream<Player> stream = Arrays.stream(Squad.INSTANCE.getAttackers());
        List<Player> result = stream.filter(line -> !line.isInjured()).limit(numberOfAttackers).collect(Collectors.toList());
        Player[] attackers = new Player[result.size()];
        attackers = result.toArray(attackers);
        return attackers;
    }

}
