import Components.Doors;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorsTest {
    Doors doors;

    @Before
    public void before(){
        doors = new Doors(true);
    }

    @Test
    public void checkIfPowered(){
        assertEquals(true, doors.isPowered());
    }
}
