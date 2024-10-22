import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
public class WordGames extends Actor
{
    private GreenfootImage img;
    private String word;
    private int speed = 3;
    public WordGames(String text){
        word = text;
        img = new GreenfootImage(word, 24, Color.RED, Color.BLACK);
        setImage(img);
    }
    public void act()
    {
        move(speed);
        if(this.getX() > 500 || this.getX() < 50){
            speed = -speed;
        }
    }
    public String BananaSplit(int insertIdx, String insertText){
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx + 1);
    }
    public String BananaSplit(char insertChar, String insertText){
        int index = word.indexOf(insertChar);
        if(index != -1){
            return word.substring(0,index) + insertText + word.substring(index + 1);
        }
        return "Character does not exist within WordGame";
    }
    public String toString(){
        return "Games[" + word + "]";
    }
    public String scramble(){
        Random rand = new Random();
        int index = rand.nextInt(word.length());
        String substring1 = word.substring(0,index);
        index = rand.nextInt(word.length() - substring1.length());
        String substring2 = word.substring(index);
        return substring2 + substring1;
        
    }
    public static void main(String args[]){
        WordGames game1 = new WordGames("Beeswax");
        System.out.println(game1);
        System.out.println(game1.BananaSplit(3, " have "));
        System.out.println(game1.BananaSplit('s'," are very cool and have "));
        System.out.println(game1.scramble());
    }
}
