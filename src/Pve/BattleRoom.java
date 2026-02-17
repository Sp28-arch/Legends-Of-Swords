package Pve;

import java.util.ArrayList;
import java.util.List;
import battle.Enemy;
import battle.Battle;

public class BattleRoom extends Room {

    public BattleRoom(Party party, int floor) {
        super(party, floor);
    }

    @Override
    public void enter() {
        System.out.println("Battle Room " + floor);

    }
}
