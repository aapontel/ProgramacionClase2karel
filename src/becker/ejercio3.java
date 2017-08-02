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
public class ejercio3 {
    public static void girarderecha(Robot karel){
       for (int i= 0;i<3;i++){
      karel.turnLeft();  
      }
}
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      for (int j= 1;j<7;j++){
         
        for (int i= 1;i<6;i++){
         Thing c2 = new Thing(prague, j, i);
      }
      }
      
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,30);
      
      for (int i= 1;i<6;i++){
         karel.move();
      }
      
     
      // Direct the robot to the final situation
     
      
      System.out.println(karel.countThingsInBackpack());
   }
    
}
