import Components.Doors;
import Components.Engine;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Car car;
    Engine engine;
    Doors doors;
    Tyres tyres;
    CarType carType;
    Customer customer;

    @Before
    public void before(){
        engine = new Engine(2000, 4);
        doors = new Doors(true);
        tyres = new Tyres(4, 225);
        car = new Car(engine, doors, tyres, carType.HYBRID, "MINI", "Blue", 28000);
        dealership = new Dealership(1000000);
        customer = new Customer(30000);
    }

    @Test
    public void hasTill(){
        assertEquals(1000000, dealership.getTill());
    }

    @Test
    public void canBuyCar(){
        dealership.buyCar(car);
        assertEquals(1, dealership.getStockCollection().size());
    }

    @Test
    public void moneyTakenOut(){
        dealership.buyCar(car);
        assertEquals(972000, dealership.getTill());
    }

    @Test
    public void canSellVehicle(){
        dealership.addCar(car);
        dealership.sellCar(car, customer);
        assertEquals()
    }
}
