/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Ghassi_joel
 */
public class ArenaTest {//test unitaire
    @Test
    public void testFight(){
        Robot robot1 = new Robot("D2R2");
        Robot robot2 = new Robot("Data");
        
        Robot winner = Arena.fight(robot1, robot2);
        
        // verification du vainqueur
        assertTrue(winner == robot1 || winner == robot2);
        
        //verification de l'etat des robots apres le combat
        if (winner == robot1){
            assertTrue(robot1.isDead());
            assertFalse(robot2.isDead());
        }else{
            assertTrue(robot1.isDead());
            assertFalse(robot2.isDead());
        }
    }}

