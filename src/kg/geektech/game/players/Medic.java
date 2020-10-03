package kg.geektech.game.players;


public class Medic extends Hero {

    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
            }
        }
    }
}
