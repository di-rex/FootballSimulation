
package com.boutsourcing.entities;

import java.util.Objects;

/**
 * class describing players in the squad
 * @author Duki
 */
public class Player {

    private SquadPosition position;
    private int quality;
    private int speed;
    private boolean injured;
    private int number;

    public SquadPosition getPosition() {
        return position;
    }

    public void setPosition(SquadPosition position) {
        this.position = position;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.quality;
        hash = 29 * hash + Objects.hashCode(this.position);
        hash = 29 * hash + this.speed;
        hash = 29 * hash + (this.injured ? 1 : 0);
        hash = 29 * hash + this.number;
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
        final Player other = (Player) obj;
        if (this.quality != other.quality) {
            return false;
        }
        if (this.speed != other.speed) {
            return false;
        }
        if (this.injured != other.injured) {
            return false;
        }
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "quality=" + quality + ", position=" + position + ", speed=" + speed + ", injured=" + injured + ", number=" + number + '}';
    }

}
