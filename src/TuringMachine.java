import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tobz0r on 2016-10-09.
 */
public class TuringMachine {

    private String tape;
    private List<State> acceptedStates=new ArrayList<>();
    private State startState;
    private State currentState;
    private int position;

    public void setInput(String input){
        tape=input;
        position=0;
    }

    public boolean step(){

    }
    public boolean isAcceptingConfiguration(){
        for(State s:acceptedStates){
            if(s.equals(currentState)){
                return true;
            }
        }
        return false;
    }

    public void printConfiguration(){
        System.out.println("State: " + currentState.getId());
        String temp=tape.replaceAll("\\s+","");;
        System.out.println(temp);
        for(int i = 0; i < position ; i++){
            System.out.print(" ");
        }
        System.out.print("^\n");
    }
}
