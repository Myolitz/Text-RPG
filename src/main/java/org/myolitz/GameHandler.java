package org.myolitz;

import org.myolitz.entities.Enemies;
import org.myolitz.entities.Player;

import java.util.Scanner;

public class GameHandler
{
    boolean isRunning = false;

    public GameHandler(){}

    public void start(Player mc, Scanner in, ActionHandler handler)
    {
        isRunning = true;

        //Will keep the game going till player dies, or refuses to continue
        while (isRunning)
        {
            /*
                    Loop is for testing "randomness"
            */
//            for (int i = 0; i < 3; i++)
//            {
//                Enemies enemy = new Enemies();
//                enemy.printInfo();
//                if (i == 2) {
//                    isRunning = false;
//                }
//            }
            Enemies enemy = new Enemies();
            enemy.printInfo();

            mc.printInfo();

            stopRunning();
        }

    }

    public void stopRunning()
    {
        isRunning = false;
    }
}
