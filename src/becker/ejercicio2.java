/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;

/**
 *
 * @author ESTUDIANTE
 */
public class ejercicio2 {
     public static void girarderecha(Robot karel){
       for (int i= 0;i<3;i++){
      karel.turnLeft();  
      }
}
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Thing c1 = new Thing(prague, 2, 2);
      Robot karel = new Robot(prague, 1, 2, Direction.SOUTH,5);
       Wall p1=new Wall (prague,1,1,Direction.NORTH);
       Wall p2=new Wall (prague,1,2,Direction.NORTH);
       Wall p3=new Wall (prague,1,1,Direction.WEST);
       Wall p4=new Wall (prague,2,1,Direction.WEST);
       Wall p5=new Wall (prague,1,2,Direction.EAST);
       Wall p7=new Wall (prague,2,1,Direction.SOUTH);
       Wall p8=new Wall (prague,1,2,Direction.SOUTH);
    
      // Direct the robot to the final situation
      girarderecha(karel);
      for (int j= 0;j<3;j++){
       karel.move();
       karel.turnLeft(); 
      }
       karel.pickThing();
       karel.turnLeft();
       for (int j= 0;j<3;j++){
       karel.move();
      girarderecha(karel);
      }
      
      System.out.println(karel.countThingsInBackpack());
   }
    
}
