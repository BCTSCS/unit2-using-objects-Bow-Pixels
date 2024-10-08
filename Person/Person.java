import greenfoot.*;

public class Person  
{
    // instance variables 
    private int speed;
    private int x;
    private int y;
    private String name;
    private boolean canTalk; 
    //private GreenfootSound sound = new GreenfootSound("Sound_Path");

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        x = 450;
        y = 500;
        speed = 5;
        name = "John";
        canTalk = false;
    }
    public Person(String namePerson)
    {
        x = 450;
        y = 500;
        speed = 5;
        name = namePerson;
        canTalk = false;
    }
    public Person(String namePerson, int sp)
    {
        x = 450;
        y = 500;
        speed = sp;
        name = namePerson;
        canTalk = false;
    }
    

    public void walk(){
        x += speed;
        y += speed;
    }
    
    public String toString(){
        return "Person's Name is " + name + " X: " + x + " Y: " + y + " Speed: " + speed + " canTalk: " + canTalk;
    }
    
    public static void main(String args[]){
        Person person1 = new Person();
        Person person2 = new Person("Evan");
        Person person3 = new Person("Joe", 12);
        
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        
        person1.walk();
        person2.walk();
        person3.walk();
        
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
