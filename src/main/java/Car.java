import Components.Doors;
import Components.Engine;
import Components.Tyres;

public class Car {
    private Engine engine;
    private Doors doors;

    private Tyres tyres;
    private CarType carType;
    private String model;
    private String colour;
    private Integer price;

    public Car(Engine engine, Doors doors, Tyres tyres, CarType carType, String model, String colour, Integer price) {
        this.engine = engine;
        this.doors = doors;
        this.tyres = tyres;
        this.carType = carType;
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Doors getDoors() {
        return doors;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public Integer getPrice() {
        return price;
    }
}
