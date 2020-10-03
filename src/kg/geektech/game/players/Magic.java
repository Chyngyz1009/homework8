package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int n = r.nextInt(2) + 1;
        if (getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setDamage(heroes[i].getDamage() * n);
            }
        }

    }
}
