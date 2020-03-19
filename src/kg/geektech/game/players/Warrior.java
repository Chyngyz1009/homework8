package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        setDamage(10);
        Random s = new Random();
        int n = s.nextInt(2) + 2;
        if (getHealth() > 0) {
            setDamage(getDamage() * n);
        }
    }
}
