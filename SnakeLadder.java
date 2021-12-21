import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class SnakeLadder{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("****GAME__START****");
        System.out.println("Enter Number of players : ");
        int n=in.nextInt();
        Queue<Player> players=new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.println("Player-"+(i+1)+" name : ");
            String name=in.next();
            Player p=new Player(name);
            players.add(p);
        }
        Dice dice =new Dice();
        GameBoard gb=new GameBoard(players, dice);
        gb.startGame();
        
    }
    
}
