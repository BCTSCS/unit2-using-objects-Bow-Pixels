import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FastFish fastFish = new FastFish();
        addObject(fastFish,321,188);
        FastFish fastFish2 = new FastFish();
        addObject(fastFish2,318,240);
        FastFish fastFish3 = new FastFish();
        addObject(fastFish3,329,283);
        FastFish fastFish4 = new FastFish();
        addObject(fastFish4,480,267);
        Shark shark = new Shark();
        addObject(shark,115,150);
        SlowFish slowFish = new SlowFish();
        addObject(slowFish,164,55);
        SlowFish slowFish2 = new SlowFish();
        addObject(slowFish2,103,242);
        SlowFish slowFish3 = new SlowFish();
        addObject(slowFish3,311,119);
        SlowFish slowFish4 = new SlowFish();
        addObject(slowFish4,232,234);
    }
}
