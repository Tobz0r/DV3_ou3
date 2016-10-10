import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tobz0r on 2016-10-09.
 */
public class TuringMachine {

    private String tape;
    private List<State> acceptedStates=new ArrayList<>();
    private List<Transition> transitions=new ArrayList<>();
    private State startState;
    private State currentState;
    private int position;

    public static void main(String[] args){
        TuringMachine m = new TuringMachine();
        m.setInput("a b c d e f ");
        m.currentState=new State(2);
        m.printConfiguration();
    }
    public void setInput(String input){
        tape=input.replaceAll("\\s+","");;
        position=0;
    }

    public boolean step(){
        return true;
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
        System.out.println(tape);
        for(int i = 0; i < position ; i++){
            System.out.print(" ");
        }
        System.out.print("^\n");
    }
    private boolean isPalindrome(String s){
        return s==new StringBuilder(s).reverse().toString();
    }
}

