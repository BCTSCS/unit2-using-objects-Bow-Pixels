import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Actor
{
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 8);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 8);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 4, getY() );
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 4, getY());
        }
    }
}
