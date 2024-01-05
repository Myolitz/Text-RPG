package org.myolitz.entities;
import org.myolitz.Utils.printUtils;
import org.myolitz.abilities.PlayerAbilities;

public class Player extends EntityBase implements printUtils
{
    PlayerAbilities[] abilities = new PlayerAbilities[4];

    public Player()
    {
        currMana = maxMana = PLAYER_BASE_MANA;
        currHp = maxHp = PLAYER_BASE_HEALTH;
        createAbilities();
    }

    void createAbilities()
    {
        abilities[0] = new PlayerAbilities("Fireball", 5, 4);
        abilities[1]= new PlayerAbilities("Magic Missile", 10, 9);
        abilities[2] = new PlayerAbilities("Razor Leaf", 8, 6);
        abilities[3] = new PlayerAbilities("Fireball", 0, 1);

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println(name + "\nHP: " + currHp + "/" + maxHp);
        System.out.println("Mana: " + currMana + "/" + maxMana);
    }
}
