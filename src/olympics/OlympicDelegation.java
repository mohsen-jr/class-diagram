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
public class OlympicDelegation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player pl1 = new Player(0,"ahmed","cairo-egypt");
        Player pl2 = new Player(1,"ali","alex-egypt");
        Player pl3 = new Player(2,"amr","tanta-egypt");
        Player pl4 = new Player(3,"alaa","bnha-egypt");
        pl1.assignCoach("hassan");
        pl2.assignCoach("hassan");
        pl3.assignCoach("hassan");
        pl4.assignCoach("hassan");
        List<Player> plist = new ArrayList<Player>();
        plist.add(pl1);
        plist.add(pl2);
        plist.add(pl3);
        plist.add(pl4);
        
        Team tm = new Team(0,plist);
        Coach ch = new Coach(0,plist,tm);
        Medal md = new Medal(1,pl1);
        
        
        
    }
    
}
