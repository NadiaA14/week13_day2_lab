import Components.Doors;
import Components.Engine;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    Car car;
    Engine engine;
    Doors doors;
    Tyres tyres;
    CarType carType;


    @Before
    public void before(){
    engine = new Engine(2000, 4);
    doors = new Doors(true);
    tyres = new Tyres(4, 225);
    car = new Car(engine, doors, tyres, carType.HYBRID, "MINI", "Blue", 28000);
    customer = new Customer(30000);
    }

    @Test
    public void hasMoney(){
        assertEquals(30000, customer.getMoney());
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(car);
        assertEquals(1, customer.getCarCollection().size());
    }

    @Test
    public void moneyGetsTakenOut(){
        customer.buyCar(car);
        assertEquals(2000, customer.getMoney());
    }
}
