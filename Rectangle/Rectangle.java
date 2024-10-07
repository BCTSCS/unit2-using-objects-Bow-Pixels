import greenfoot.*;

public class Rectangle extends Actor{
  // instance variables
  private int width;
  private int height;
  
  // Constructor Width and Height
  public Rectangle(int w, int h){
    width = w;
    height = h;
    getImage().scale(width*10,height*10);
  }
  
  public Rectangle(int s){
    width = s;
    height = s;
    getImage().scale(width*10,height*10);
  }
  
  public Rectangle(){
    width = 10;
    height = 10;
    getImage().scale(width*10,height*10);
  }
  // Main function
  public static void main(String args[]){
    Rectangle rect1;
    rect1 = new Rectangle(12,10);
    System.out.println(rect1);
  }
  
  public String toString(){
      return "Rectangle " + System.identityHashCode(this) + "\nRectangle Width: " + width + "\nRectangle Height: " + height;
  }
}
