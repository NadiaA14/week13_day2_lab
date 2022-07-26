import java.util.ArrayList;

public class Customer {
    private int money;
    private ArrayList<Car> carCollection;

    public Customer(int money) {
        this.money = money;
        this.carCollection = new ArrayList<>();
    }

    public ArrayList<Car> getCarCollection() {
        return carCollection;
    }

    public void setCarCollection(ArrayList<Car> carCollection) {
        this.carCollection = carCollection;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyCar(Car car) {
        this.carCollection.add(car);
        this.money -= car.getPrice();
    }
}
