/**
 * Created by Tobz0r on 2016-10-09.
 */
public class State {

    private int id;

    public State(int id){
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        State s = (State) o;
        return id == s.id;
    }
}
