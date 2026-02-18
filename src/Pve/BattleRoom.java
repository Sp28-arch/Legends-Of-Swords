package Pve;

import battle.Hero;
import java.util.List;


public class BattleRoom extends Room {

    public BattleRoom(int floor) {
        super(floor);
    }

    @Override
    public void enter(Party party) {
        System.out.println("Entered Battle Room");

    }
}
