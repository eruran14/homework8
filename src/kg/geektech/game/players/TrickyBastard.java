package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class TrickyBastard extends Hero{
    public TrickyBastard(String name, int health, int damage) {
        super(name, health, damage, SuperAbilities.TRICKY);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int baseHealth = this.getHealth();
        int baseDamage = this.getDamage();
        int randomRound = RPG_Game.random.nextInt(4);
        if (randomRound == 2){
            setHealth(baseHealth);
            setDamage(0);
        }
        else {
            this.setDamage(baseDamage);
        }
    }
}
