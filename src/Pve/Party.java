package Pve;
import java.util.ArrayList;
import java.util.List;
import battle.Hero;

public class Party {
    private List<Hero> heroes = new ArrayList<>();

    public void addHero(Hero h) {
        heroes.add(h);
    }

    public List<Hero> getHeroes() {
        return heroes;
    }
}
