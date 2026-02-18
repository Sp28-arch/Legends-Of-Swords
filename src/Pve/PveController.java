package Pve;

import battle.Hero;
import java.util.List;


public class PveController {

    private Campaign campaign;

    public PveController(List<Hero> heroList) {
        Party playerParty = new Party();
        for (Hero hero : heroList) {
            playerParty.addHero(hero);
        }
        this.campaign = new Campaign(playerParty);
    }

    public void startCampaign() {
        campaign.start();
    }

    public void nextRoom() {
        System.out.println("Moving to next room...");
    }

    public Campaign getCampaign() {
        return campaign;
    }
}
