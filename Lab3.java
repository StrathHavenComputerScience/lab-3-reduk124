public class Lab3
{
    public static void testLightCandles1()
    {
        Robot.load("candles1.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles2()
    {
        Robot.load("candles2.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void lightCandles()
    {
        //insert instructions below
        Robot.turnLeft();
        Robot.move();
        turnRight();
        lightEightCandles();
        lightOneCandle();
        lightOneCandle();

    }

    public static void turnRight()
    {
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
    } 

    public static void lightOneCandle()
    {
        if(Robot.frontIsClear())
        {
            makeShortCandle();
        }
        else
        {
            makeTallCandle();
        }

    }

    public static void makeShortCandle()
    {
        Robot.move();
        Robot.makeDark();
        Robot.move();
    }

    public static void makeTallCandle()
    {
        Robot.turnLeft();
        Robot.move();
        turnRight();
        makeShortCandle();
        turnRight();
        Robot.move();
        Robot.turnLeft();
    }

    public static void lightEightCandles()
    {
        lightOneCandle();
        lightOneCandle();
        lightOneCandle();
        lightOneCandle();
        lightOneCandle();
        lightOneCandle();
        lightOneCandle();
        lightOneCandle();
    }

    //Run this method to test completeRoom on map room1.txt
    public static void testCompleteRoom1()
    {
        Robot.load("room1.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    //Run this method to test completeRoom on map room2.txt
    public static void testCompleteRoom2()
    {
        Robot.load("room2.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    //Complete this method.  You will need to write additional helper methods.
    public static void completeRoom()
    {
        //insert instructions below
        completeSide();
        completeSide();
        completeSide();
        completeSide();

    }

    public static void completeLeft()
    {
        Robot.turnLeft();
        if(Robot.frontIsClear())
        {
            Robot.move();
            if(Robot.onDark())
            {
            }
            else
            {
                Robot.makeDark();
            }
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.turnLeft();
            Robot.turnLeft();

        }
        turnRight();

    }

    public static void completeSide()
    {
        completeLeft();
        Robot.move();
        completeLeft();
        Robot.move();
        completeLeft();
        Robot.move();
        completeLeft();
        Robot.move();
        completeLeft();
        turnRight();
    }

    //Run this method to test swapAll on map swap1.txt
    public static void testSwapAll1()
    {
        Robot.load("swap1.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll2()
    {
        Robot.load("swap2.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Complete this method.  You will need to write additional helper methods.
    public static void swapAll()
    {
        //insert instructions below

        swapFive();
        Robot.move();
        swapFive();

    }

    public static void storeRight()
    {
        turnRight();
        Robot.move();
        if(Robot.onDark())
        {
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.makeDark();
        }
        else
        {
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
        }
    }

    public static void setRight()
    {
        Robot.move();
        if(Robot.onDark())
        {
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.move();
            if(Robot.onDark())
            {
            }
            else
            {
                Robot.makeDark();
            }
        }
        else
        {
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.move();
            if(Robot.onDark())
            {
                Robot.makeLight();
            }
        }
    }

    public static void setLeft()
    {
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.move();
        if(Robot.onDark())
        {
            Robot.move();
            if(Robot.onDark())
            {
            }
            else
            {
                Robot.makeDark();
            }
        }
        else
        {
            Robot.move();
            if(Robot.onDark())
            {
                Robot.makeLight();
            }
            else
            {

            }
        }
    }

    public static void swapOne()
    {
        storeRight();
        setRight();
        setLeft();
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.move();
        if(Robot.onDark())
        {
            Robot.makeLight();
        }

    }

    public static void swapFive()
    {
        swapOne();
        Robot.turnLeft();
        Robot.move();
        swapOne();
        Robot.turnLeft();
        Robot.move();
        swapOne();
        Robot.turnLeft();
        Robot.move();
        swapOne();
        Robot.turnLeft();
        Robot.move();
        swapOne();
        Robot.turnLeft();

    }

    //Don't run these. I will!
    public static void testLightCandles3()
    {
        Robot.load("candles3.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles4()
    {
        Robot.load("candles4.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testCompleteRoom3()
    {
        Robot.load("room3.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testCompleteRoom4()
    {
        Robot.load("room4.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testSwapAll3()
    {
        Robot.load("swap3.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll4()
    {
        Robot.load("swap4.txt");
        Robot.setDelay(0.05);
        swapAll();
    }
}
