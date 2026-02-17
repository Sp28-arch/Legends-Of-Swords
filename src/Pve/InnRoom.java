package Pve;

import battle.Hero;

public class InnRoom extends Room {

    public InnRoom(Party party, int floor) {
        super(party, floor);
    }

    @Override
    public void enter() {
        System.out.println("Inn Room " + floor);


    }
}
