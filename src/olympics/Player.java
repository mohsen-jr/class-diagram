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
    
    public Player(int id, String name, String addr){
        this.playerID = id;
        super.setNameAdd(name, addr);
    }
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
