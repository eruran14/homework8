package kg.geektech.game.players;

public abstract class Hero extends GameEntity implements HavingSuperPower{

    private SuperAbilities superAbility;

    public Hero(String name, int health, int damage, SuperAbilities superAbility) {
        super(name, health, damage);
        this.superAbility = superAbility;
    }

    public SuperAbilities getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbilities superAbility) {
        this.superAbility = superAbility;
    }

    public void hit(Boss boss){
        if(boss.getHealth() > 0){
            boss.setHealth(boss.getHealth() - this.getDamage());
        }
    }

    public void hitHeroes(Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());
            }
        }
    }
}
