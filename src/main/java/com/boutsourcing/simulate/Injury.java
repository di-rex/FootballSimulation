package com.boutsourcing.simulate;

import com.boutsourcing.entities.Player;
import com.boutsourcing.entities.Squad;
import java.util.Random;

/**
 * Methods of this class are taking care about players injuries - simulate
 * injuries and set right players to be unavailable
 *
 * @author Duki
 */
public class Injury {

    /**
     * simulate injury of one player from the team
     *
     * @param team
     */
    public static void simulateInjury(Player[] team) throws Exception {
        try {
            int injuredPlayer = getRandomPlayer();
            Player player = team[injuredPlayer];
            System.out.println("Injured player number " + player.getNumber());
            findInjuredPlayer(player);
        } catch (Exception e) {
            throw new Exception("OOOPS, I can't hurt any player at the moment, I am a good guy :) ");
        }
    }

    /**
     * get random player from team to be injured
     *
     * @return random position of injured player in an array
     */
    private static int getRandomPlayer() {
        Random random = new Random();
        int injured = random.nextInt(10);
        return injured;

    }

    /**
     * find player in a squad and mark it as injured
     *
     * @param injuredPlayer
     */
    private static void findInjuredPlayer(Player injuredPlayer) {
        Player[] playerArray;

        switch (injuredPlayer.getPosition()) {
            case GOALKEEPERS:
                playerArray = Squad.INSTANCE.getGoalkeepers();
                break;
            case DEFFENDERS:
                playerArray = Squad.INSTANCE.getDefenders();
                break;
            case MIDFIELDERS:
                playerArray = Squad.INSTANCE.getMidfielders();
                break;
            case ATTACKERS:
                playerArray = Squad.INSTANCE.getAttackers();
                break;
            default:
                return;
        }
        findInSquadArray(playerArray, injuredPlayer);

    }

    /**
     * find injured player in specified position array and set him injured
     *
     * @param players - array of players from the specified position
     * @param injuredPlayer - injured player
     */
    private static void findInSquadArray(Player[] players, Player injuredPlayer) {

        for (Player arrayPlayer : players) {
            if (injuredPlayer.equals(arrayPlayer)) {
                arrayPlayer.setInjured(true);
            }

        }

    }
}
