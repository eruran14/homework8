package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Witcher extends Hero{
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbilities.SACRIFICE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.setDamage(0);
        boolean isReviving = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (isReviving && heroes[i].getHealth() <= 0 && this != heroes[i]){
                heroes[i].setHealth(100);
                this.setHealth(0);
                System.out.println(this.getName() + " revived " + heroes[i].getName());
                break;
            }
        }
    }
}

