import Components.Doors;
import Components.Engine;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Engine engine;
    Doors doors;
    Tyres tyres;
    CarType carType;
    String model;
    String colour;
    Integer price;
    Car car;

    @Before
    public void before(){
        engine = new Engine(2000, 4);
        doors = new Doors(true);
        tyres = new Tyres(4, 225);
        car = new Car(engine, doors, tyres, carType.HYBRID, "MINI", "Blue", 28000);
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasDoors(){
        assertEquals(doors, car.getDoors());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void hasCarType(){
        assertEquals(carType.HYBRID, car.getCarType());
    }

    @Test
    public void hasModel(){
        assertEquals("MINI", car.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(28000, car.getPrice(), 0.01);
    }

}
