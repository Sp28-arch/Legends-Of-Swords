package Pve;


public abstract class Room {

    protected int floor;

    public Room(int floor) {
        this.floor = floor;
    }

    public abstract void enter(Party party);
}
