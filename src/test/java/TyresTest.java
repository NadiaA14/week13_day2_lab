import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(3, 205);
    }

    @Test
    public void hasTread(){
        assertEquals(3, tyres.getTread());
    }
}
