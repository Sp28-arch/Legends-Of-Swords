package Pve;


public class Campaign {

    private Party party;
    private int currentRoom;

    public Campaign(Party party) {
        this.party = party;
        this.currentRoom = 1;
    }

    public void start() {
        System.out.println("Welcome to the Dungeon");
    }

    public Party getParty() {
        return party;
    }
}
