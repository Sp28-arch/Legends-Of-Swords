package Pve;

import java.util.Random;

public class Campaign {
    private int currentFloor = 1;
    private Party party;
    private Random random = new Random();

    public Campaign(Party party) {
        this.party = party;
    }

    public int getFloor() {
        return currentFloor;
    }

    public void nextFloor() {
        currentFloor++;
    }

    public Room generateRoom() {
        if (random.nextBoolean()) {
            return new BattleRoom(party, currentFloor);
        } else {
            return new InnRoom(party, currentFloor);
        }
    }
}
