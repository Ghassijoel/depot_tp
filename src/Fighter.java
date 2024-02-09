/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Ghassi_joel
 */
public class Fighter extends Robot {
    private Random random;
    
    public Fighter(String name, long seed){
        super(name);
        this.random = new Random(seed);
    }
    
    @Override
    
    public void fire (Robot target){
        if (random.nextBoolean()){
            super.fire(target);
        }else{
            System.out.println(getName() + " n'a pas touche sa cible !");
        }
    }
    
    @Override 
    public String toString(){
        return "Fighter" + getName();
    }
}



/*
Concernant la visibilite des champs, il est recommaande de les declarer avec une 
visibilite private par defaur afin de respecter le principe de l'encapsulation.
En declarant les champs en tant que private, on limite l'acces direct aux donnees
de la classe depuis l'exterieur, ce qui facilite la maintenance, la modification 
el la validation des donnees.
*/