import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(2300, 4);
    }

    @Test
    public void hasHP(){
        assertEquals(2300, engine.getHP());
    }

    @Test
    public void hasVolume(){
        assertEquals(4, engine.getVolume());
    }

}
