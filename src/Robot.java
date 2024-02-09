/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ghassi_joel
 */
public class Robot {
    private String name;
    private int health;

 public Robot(String name){
   this.name = name;
   this.health  = 10;
}
 
 public String getName(){
     return name ;
 }
  public void fire(Robot target){
      target.health -= 2;
      System.out.printf("Robot %s a ete touche par le robot %s !%n",target.name, this.name);
  
  }
  public boolean isDead(){
      return health <= 0;
  }

@Override
  public String toString(){
    return "Robot " + name;
}
}