package org.myolitz.Utils;

public class GenUtility {

    public int GenerateNumber(int min, int max)
    {
        return (int)(Math.random() * ((max - min) + 1));
    }

    public boolean CheckNum(int x, int min, int max)
    {
        return x < max && x > min;
    }
}
