package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Deku extends Hero{
    public Deku(String name, int health, int damage) {
        super(name, health, damage, SuperAbilities.INCREASE_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean isPowerIncreasing = RPG_Game.random.nextBoolean();
        int powerIncrease = RPG_Game.random.nextInt(3);
        if(isPowerIncreasing){
            switch (powerIncrease){
                case 0: this.setDamage((int)(this.getDamage() + (this.getDamage() * 0.2)));
                        this.setHealth((int)(this.getHealth() - (this.getDamage() * 0.2)));
                        break;
                case 1: this.setDamage((int)(this.getDamage() + (this.getDamage() * 0.5)));
                        this.setHealth((int)(this.getHealth() - (this.getDamage() * 0.5)));
                        break;
                case 2: this.setDamage(this.getDamage() + (this.getDamage() * 2));
                        this.setHealth((this.getHealth() - (this.getDamage() * 2)));
                        break;
            }
//            System.out.println(this.getName() + " increased damage by " + this.getDamage());
        }
    }
}
