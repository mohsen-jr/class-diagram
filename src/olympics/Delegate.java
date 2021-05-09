/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olympics;
import java.util.*;
/**
 *
 * @author mahmoud_mohsen
 */
public class Delegate {
    public String country;
    private int numPlayers;
    private List<Player> player = new ArrayList<Player>();
    private List<Coach> coach = new ArrayList<Coach>();
    
    public Delegate(String country){
        this.country = country;
        
    }
    
    public void addPlayer(Player player){
        this.player.add(player);
        numPlayers++;
    }
    
    public void addCoach(Coach coach){
        this.coach.add(coach);
    }
    
    public void setNumPlayers(int num){
        this.numPlayers = num;
    }
    public int getNumPlayers(){
        return this.numPlayers;
    }
}
