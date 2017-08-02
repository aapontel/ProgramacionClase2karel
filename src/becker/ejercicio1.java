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
public class ejercicio1 {
    public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      //Thing c1 = new Thing(prague, 1, 2);
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
       Wall p1=new Wall (prague,1,1,Direction.NORTH);
       Wall p2=new Wall (prague,1,2,Direction.NORTH);
       Wall p3=new Wall (prague,1,1,Direction.WEST);
       Wall p4=new Wall (prague,2,1,Direction.WEST);
       Wall p5=new Wall (prague,1,2,Direction.EAST);
       Wall p6=new Wall (prague,2,2,Direction.EAST);
       Wall p7=new Wall (prague,2,1,Direction.SOUTH);
       Wall p8=new Wall (prague,2,2,Direction.SOUTH);
    
      // Direct the robot to the final situation
      for (int i= 0;i<2;i++){
      karel.turnLeft();  
      }
      karel.move();
      for (int i= 0;i<3;i++){
      karel.turnLeft();  
      }
      for (int j= 0;j<3;j++){
       karel.move();
       karel.move();
       karel.move();
        for (int i= 0;i<3;i++){
      karel.turnLeft();  
      }
      }
       karel.move();
       karel.move();
      for (int i= 0;i<2;i++){
      karel.turnLeft();  
      }
      
      System.out.println(karel.countThingsInBackpack());
   }
    
}
