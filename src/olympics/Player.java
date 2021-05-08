/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olympics;

/**
 *
 * @author mahmoud_mohsen
 */
public class Player extends Person {
    private int playerID;
    private int numMedal;
    private String coachName;
    private String team;
    
    public Player(int player_id){
        playerID = player_id;
    }
//    
//    public Player(){
//        playerID = 0;
//    }
    public void setID(int id){
        this.playerID = id;
    }
    
    public int getID(){
       return this.playerID;
    }
    
    public void assignCoach(String coach){
        this.coachName = coach;
    }
    
    public void assignTeam(String team){
        this.team = team;
    }
    
    public void addMedal(int num){
        this.numMedal = num;
    }
    
    
}
