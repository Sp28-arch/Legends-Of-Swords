package Pve;


public class InnRoom extends Room {

    public InnRoom(int floor) {
        super(floor);
    }

    @Override
    public void enter(Party party) {
        System.out.println("Entered Inn Room");

    }
}
