import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Tobz0r on 2016-10-09.
 */
public class TMFactory {



    public TuringMachine createMachine(InputStream in) throws IOException {
        return new TuringMachine();
    }
}
