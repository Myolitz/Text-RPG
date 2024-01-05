package org.myolitz.entities;

public class EntityBase {
    //Player exclusive variables
    final int PLAYER_BASE_HEALTH = 20;
    final int PLAYER_BASE_MANA = 15;
    int currMana;
    int maxMana;

    //Enemy-exclusive final vars
    final int MAX_NAME_RANGE = 9;
    final int MIN_NAME_RANGE = 0;
    final int MAX_HP_RANGE = 40;
    final int MIN_HP_RANGE = 10;

    //Shared vars
    String name;
    int maxHp;
    int currHp;

    //Empty Constructor
    public EntityBase(){};
}
