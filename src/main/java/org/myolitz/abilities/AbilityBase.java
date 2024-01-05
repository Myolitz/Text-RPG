package org.myolitz.abilities;

public class AbilityBase
{
    int damage = 0;
    int manaCost = 0;
    String name = "";

    public AbilityBase(String abil, int dmg, int cost)
    {
        this.name = abil;
        this.damage = dmg;
        this.manaCost = cost;
    }

    public int getDamage()
    {
        return damage;
    }

    public int getManaCost()
    {
        return manaCost;
    }

    public String getName() {
        return name;
    }
}
