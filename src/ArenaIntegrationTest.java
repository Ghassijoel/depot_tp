/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;
/**
  * @author Ghassi_joel
 */
public class ArenaIntegrationTest {

     @Test
     public void testFightIntegration(){
         Robot d2r2 = new Robot("D2R2");
         Robot data = new Robot("Data");
         Arena arena = new Arena();
         
         //Verification du deroulement et du resultat du combat
         Robot winner = arena.fight(d2r2, data);
         
         //Verification de l'etat final des robots apres le combat
         assertTrue(d2r2.isDead() || data.isDead());
         assertTrue(winner == d2r2 || winner == data);
     }
}
