package becker;

import becker.robots.*;

public class DeliverParcel
{   
    
   public static void girarderecha(Robot karel){
       for (int i= 0;i<3;i++){
      karel.turnLeft();  
      }
}
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      for (int j= 1;j<5;j++){
         
        for (int i= 1;i<6;i++){
         Thing c2 = new Thing(prague, j, i);
      }
      }
      
      Robot karel = new Robot(prague, 1, 0, Direction.SOUTH,5);
      
     
      // Direct the robot to the final situation
     
      
      System.out.println(karel.countThingsInBackpack());
   }
}
/*karel.move();
      karel.move();
      
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();	// finished turning right
      karel.move();*/
     // karel.putThing();