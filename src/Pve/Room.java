package Pve;

public abstract class Room {
    protected Party party;
    protected int floor;

    public Room(Party party, int floor) {
        this.party = party;
        this.floor = floor;
    }

    public abstract void enter();
}
