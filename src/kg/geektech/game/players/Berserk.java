package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero{
    private int savedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbilities.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        savedDamage = RPG_Game.random.nextInt(boss.getDamage());
        this.setHealth(this.getHealth() - savedDamage);
        boss.setHealth(boss.getHealth() - savedDamage);
    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
