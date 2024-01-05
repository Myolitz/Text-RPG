package org.myolitz;

import org.myolitz.entities.Player;
import java.util.Scanner;



public class Main
{
    public static void main(String[] args)
    {
        //Initializing all objects as needed
        Scanner in = new Scanner(System.in);
        Player mc = new Player();
        GameHandler game = new GameHandler();
        ActionHandler handler = new ActionHandler();

        System.out.println("Will you play? [Y/N]");
        System.out.println("Version 0.1 - Enemy and Player Setup");

        //Guarantees a Y/N even if user inputs yes/no, etc
        String x = in.next();
        x = String.valueOf(x.charAt(0)).toUpperCase();

        if (x.equals("Y"))
        {
            System.out.println("Starting game...");
            System.out.println("Enter your player's name");
            String n = in.next();
            mc.setName(n);
            game.start(mc, in, handler);
        }
        else
        {
            System.out.println("Hope to see you soon!");
        }
    }
}