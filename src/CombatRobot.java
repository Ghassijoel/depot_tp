/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ghassi_joel
 */
public class CombatRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                  Robot d2r2 = new Robot("D2R2");
        Robot data = new Robot("Data");
        
        Robot winner = Arena.fight(d2r2, data);
       // Arena arena = new Arena();
       // Robot winner = Arena.fight(d2r2, data);
        
        System.out.println("Le vainqueur est " + winner + " ! ");
    }
}