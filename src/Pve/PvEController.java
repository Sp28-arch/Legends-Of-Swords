package Pve;

public class PvEController {
    private Campaign campaign;

    public void startCampaign(Party party) {
        campaign = new Campaign(party);
    }

    public void nextRoom() {
        if (campaign.getFloor() > 30) {
            System.out.println("End");
            return;
        }

        Room room = campaign.generateRoom();
        room.enter();
        campaign.nextFloor();
    }
}
