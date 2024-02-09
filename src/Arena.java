/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ghassi_joel
 */
public class Arena {
    public static Robot fight(Robot robot1, Robot robot2){
        while(!robot1.isDead() && !robot2.isDead()){
            robot1.fire(robot2);
            if(!robot2.isDead()){
                robot2.fire(robot1);
            }
        }
        
        if(robot1.isDead()){
            System.out.println(robot1 + " est detruit/mort !");
            return robot2;
        
        }else{
    System.out.println(robot2 + " est detruit/mort !");
     return robot1;
}
}
}
