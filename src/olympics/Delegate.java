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
    private List<Player> player;
    private List<Coach> coach;
    
    public Delegate(String country, List<Player> player, List<Coach> coach){
        this.country = country;
        this.player = player;
        this.coach = coach;
        numPlayers = player.size();
    }
    public void addPlayer(Player player){
        this.player.add(player);
        numPlayers++;
    }
    
    public void addCoach(Coach coach){
        this.coach.add(coach);
    }
    
    public int getNumPlayers(){
        return this.numPlayers;
    }
}
