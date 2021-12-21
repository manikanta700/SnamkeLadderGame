import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class GameBoard extends Jumpper{
    Queue<Player> players;
    List<String> winList=new ArrayList<>();
    Dice dice;
    public GameBoard(Queue<Player> players,Dice dice){
         this.players=players;
         this.dice=dice;
    }
    public void startGame(){
        while(players.size()>1){
        Player playBoy=players.poll();
        int val=dice.rollDice();
        System.out.println(playBoy.name+" got "+val);
        int newPosition=playBoy.position+val;
        newPosition=jump(newPosition);
        if(newPosition==100){
            System.out.println(playBoy.name+" won the game \n ****\n ****");
            winList.add(playBoy.name);
            
            }
       else if(newPosition>100){
            newPosition=newPosition-val;
            players.offer(playBoy);
            }
       else{
            playBoy.position=newPosition;
            System.out.println(playBoy.name+" current position is : "+newPosition);
            players.offer(playBoy);
            }

    }
    for(int i=0;i<winList.size();i++){
        System.out.println((i+1)+" place is "+winList.get(i));
    }
}
}
