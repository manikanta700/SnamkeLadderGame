import java.util.Random;
public class Dice {
    public int rollDice(){
        Random r=new Random();
        int x=r.nextInt(7);
        if(x==0){
            return 1;
        }
        return x;
    }
    
}
