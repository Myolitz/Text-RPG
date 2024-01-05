package org.myolitz.entities;

import org.myolitz.Utils.printUtils;
import org.myolitz.Utils.GenUtility;

public class Enemies extends EntityBase implements printUtils {
    //Used to access utility methods
    GenUtility genUtil = new GenUtility();

    //Global Scope Variables
    final String[] nameList;
    String[] moves;

    //Constructor
    public Enemies()
    {
        //Creating the List + Name
        nameList = new String[]
                {
                        "Orc",
                        "Nymph",
                        "Gnome",
                        "Troll",
                        "Banshee",
                        "France",
                        "Jehovah's Witness",
                        "IRS Tax Agent",
                        "Obama (Lizard)",
                        "Redditor"
                };
        createName();

        //Setting hp values for whatever enemy is created
        /*
            TEST LATER, KEPT GETTING RESULTS LESS THAN 10
            Averages values of ~12-26
            Haven't gotten it above 30 even w/ threshold at 40
         */
        generateHp();
    }

    //Probably very convoluted way of going about it, but yes :chad:
    public void createName()
    {
        int num = genUtil.GenerateNumber(MIN_NAME_RANGE, MAX_NAME_RANGE);
        boolean validNum = genUtil.CheckNum(num, MIN_NAME_RANGE, MAX_NAME_RANGE);
        while (!validNum)
        {
            num = genUtil.GenerateNumber(MIN_NAME_RANGE, MAX_NAME_RANGE);
            validNum = genUtil.CheckNum(num, MIN_NAME_RANGE, MAX_NAME_RANGE);
        }
        name = nameList[num];
    }

    /**
     * Generates a number for the max and current health for the enemies
     * Extra checks and balances are active to ensure a maxHp value of above 10 w/o any extra modifiers
     *
     * @see GenUtility
     */
    public void generateHp()
    {
        currHp = maxHp = genUtil.GenerateNumber(MIN_HP_RANGE, MAX_HP_RANGE);
        if (maxHp == 0) {
            while (maxHp == 0) {
                currHp = maxHp = genUtil.GenerateNumber(MIN_HP_RANGE, MAX_HP_RANGE);
            }
        }
        else if (maxHp < 10) {
            currHp = maxHp += 10;
        }
    }

    /**
     * @see printUtils
     */
    @Override
    public void printInfo() {
        System.out.println(name + "\nHP: " + currHp + "/" + maxHp);
    }
}
