package Pve;

import battle.Hero;
import java.util.ArrayList;
import java.util.List;


public class Party {

    private List<Hero> heroes;

    public Party() {
        heroes = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public List<Hero> getHeroes() {
        return heroes;
    }
}
