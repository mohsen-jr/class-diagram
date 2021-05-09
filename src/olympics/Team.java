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
public class Team {
    private int teamID;
    public List<Player> member;
    private int numPlayers;
    
    public Team(int teamid, List<Player> teamMemb){
        member = teamMemb;
        teamid = teamID;
        this.numPlayers = teamMemb.size();
    }
    
}
