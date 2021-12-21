import java.util.Map;
import java.util.*;


public class Jumpper {
    static Map< Integer , Integer > snake = new HashMap < Integer , Integer >();
    static Map < Integer , Integer > ladder = new HashMap< Integer , Integer >();
    {
    snake.put(99,54);
    snake.put(70,55);
    snake.put(52,42);
    snake.put(25,2);
    snake.put(95,72);
        
    ladder.put(6,25);
    ladder.put(11,40);
    ladder.put(60,85);
    ladder.put(46,90);
    ladder.put(17,69);     
    }
    public int jump(int newPosition){

    if(snake.containsKey(newPosition)){
          newPosition= snake.get(newPosition);
    }
    if(ladder.containsKey(newPosition)){
        newPosition= ladder.get(newPosition);
  }
   
        return newPosition;
        
        }
}
